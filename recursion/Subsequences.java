public class Subsequences {

    // Function to generate all subsequences
    public static void generateSubsequences(String str, String current, int index) {
        // Base case: if the index reaches the length of the original string, print the current subsequence
        if (index == str.length()) {
            System.out.println(current);
            return;
        }

        // Include the character at the current index in the subsequence
        generateSubsequences(str, current + str.charAt(index), index + 1);
        
        // Exclude the character at the current index from the subsequence
        generateSubsequences(str, current, index + 1);
    }

    // Main method to test the subsequences
    public static void main(String[] args) {
        String str = "abc"; // Change this string to test with other inputs
        generateSubsequences(str, "", 0); // Start generating subsequences
    }
}

