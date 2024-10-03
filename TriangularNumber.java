public class TriangularNumber {

    // Recursive method to find the nth triangular number
    public static int triangularNumber(int n) {
        // Base case: the 1st triangular number is 1
        if (n == 1) {
            return 1;
        }
        // Recursive case: nth triangular number is n + (n-1)th triangular number
        return n + triangularNumber(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // Example: Find the 5th triangular number
        int result = triangularNumber(n);
        System.out.println("The " + n + "th triangular number is: " + result);
    }
}

