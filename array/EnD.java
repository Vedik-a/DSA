public class EnD {
    public int countPairs(int[] nums, int k) {
        int count = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    int x = i*j;
                    if(x%k==0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        EnD ed = new EnD();
        int[] nums={1,4,3,5,6,7,8};
        int k = 2;
        System.out.println(ed.countPairs(nums, k));
    }
}
