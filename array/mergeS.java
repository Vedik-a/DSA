import java.util.Arrays;

public class mergeS {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int midx = m - 1;
        int nidx = n - 1;
        int right = m + n - 1;

        while (nidx >= 0) {
            if (midx >= 0 && nums1[midx] > nums2[nidx]) {
                nums1[right] = nums1[midx];
                midx--;
            } else {
                nums1[right] = nums2[nidx];
                nidx--;
            }
            right--;
        }
    }

    public static void main(String[] args) {
        mergeS ms = new mergeS();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        ms.merge(nums1, 3, nums2, 3);
        
        // Print the result
        System.out.println("Merged array: " + Arrays.toString(nums1));
    }
}
