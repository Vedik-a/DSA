public class RodCutting {

    // Recursive function to find the maximum revenue
    public static int rodCutting(int[] prices, int n) {
        // Base case: if rod length is 0, no revenue can be obtained
        if (n == 0) {
            return 0;
        }

        int maxRevenue = Integer.MIN_VALUE;

        // Try all possible cuts (from 1 to n)
        for (int i = 1; i <= n; i++) {
            // Recursively find the revenue for remaining length (n - i)
            int currentRevenue = prices[i - 1] + rodCutting(prices, n - i); // i-1 because prices are 0-based
            maxRevenue = Math.max(maxRevenue, currentRevenue); // Take the maximum revenue
        }

        return maxRevenue;
    }

    public static void main(String[] args) {
        // Price array where prices[i] is the price of a rod of length i+1
        int[] prices = {1, 5, 8, 9, 10, 17, 17, 20};
        int rodLength = 8; // Rod length

        // Call the recursive function and print the result
        System.out.println("Maximum revenue: " + rodCutting(prices, rodLength)); // Output: 22
    }
}
