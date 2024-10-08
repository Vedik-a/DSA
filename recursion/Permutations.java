import java.util.Arrays;

public class Permutations {

    // Function to generate all permutations
    public static void permute(char[] array, int index) {
        // Base case: if the index reaches the length of the array, print the permutation
        if (index == array.length) {
            System.out.println(Arrays.toString(array));
            return;
        }

        // Recursive case: swap each element with the current index and generate permutations
        for (int i = index; i < array.length; i++) {
            swap(array, index, i);          // Swap the current index with the loop index
            permute(array, index + 1);      // Recur for the next index
            swap(array, index, i);          // Backtrack (swap back)
        }
    }

    // Helper method to swap elements in the array
    private static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Main method to test the permutations
    public static void main(String[] args) {
        String str = "ABC"; // Change this string to test with other inputs
        char[] array = str.toCharArray();
        permute(array, 0); // Start generating permutations
    }
}
