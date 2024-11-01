public class maxp {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        double prefix=1,suffix=1;
        double ans=nums[0];
        
        for(int i=0;i<n;i++){
            
            prefix = prefix==0 ? 1 : prefix;
            suffix = suffix==0 ? 1 : suffix;
            
            prefix *= (double) nums[i];   //prefix product
            suffix *= (double) nums[n-1-i];    //suffix product
            
            ans = Math.max(ans,Math.max(prefix,suffix));
            
        }
        
        return (int) ans;

    }
    public static void main(String[] args) {
        maxp m = new maxp();
        int[] nums = {2,3,-2,4};
        System.out.println(m.maxProduct(nums));
    }
}
