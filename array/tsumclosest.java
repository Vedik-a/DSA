import java.util.Arrays;

public class tsumclosest {
     public int threeSumClosest(int[] nums, int target) {
    int ans = nums[0] + nums[1] + nums[2];
    Arrays.sort(nums);

    for (int i = 0; i + 2 < nums.length; ++i) {
      if (i > 0 && nums[i] == nums[i - 1])
        continue;

      int l = i + 1;
      int r = nums.length - 1;

      while (l < r) {
        final int sum = nums[i] + nums[l] + nums[r];
        if (sum == target)
          return sum;
        if (Math.abs(sum - target) < Math.abs(ans - target))
          ans = sum;
        if (sum < target)
          ++l;
        else
          --r;
      }
    }

    return ans;
  }
public static void main(String[] args) {
    tsumclosest obj = new tsumclosest();
    int[] nums = {1, 2, 4, 8, 16};
    int target=9;
    System.out.println("sum is"+ obj.threeSumClosest(nums,target));
}
}
