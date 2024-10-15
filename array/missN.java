public class missN {
    public static int missingNumber(int[] nums) {
        int t1=0,t2=0;
        for(int i=0;i<nums.length;i++){
            t1=t1^nums[i];
            t2=t2^(i+1);
        }
        return t1^t2;
        } 
        public static void main(String[] args) {
            int[] nums={3,0,1};
            int r= missingNumber(nums);
            System.out.println(r);
        }
}
