
    import java.util.*;

public class fsum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> resultSet = new HashSet<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        List<Integer> arr = new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[left]);
                        arr.add(nums[right]);

                        if (!resultSet.contains(arr)) {
                            resultSet.add(arr);
                        }

                        left++;
                        right--;
                    } else if (sum < target) { // Corrected condition here
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        result.addAll(resultSet);

        return result;
    }

    public static void main(String[] args) {
        fsum solution = new fsum();

        // Test case: nums array and target value
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        // Get the result of 4-sum combinations
        List<List<Integer>> result = solution.fourSum(nums, target);

        // Output the result
        for (List<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }
}


