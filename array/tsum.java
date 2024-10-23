import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tsum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum>0){
                    k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));    
                    k--;
                    j++;
                    while(j<k && nums[j]==nums[j-1])j++;
                    while(j<k && nums[k]==nums[k+1])k--; 
                }
            }
        }
        return ans;       
    }
    public static void main(String[] args) {
        tsum solution = new tsum();

        // Test case: nums array and target value
        int[] nums = {1, 0, -1, 0, -2, 2};
      

        // Get the result of 4-sum combinations
        List<List<Integer>> result = solution.threeSum(nums);

        // Output the result
        for (List<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }
}
