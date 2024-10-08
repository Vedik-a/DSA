public class knapsackk {
        public static int knapsack(int[] val, int[] wt, int W, int n) {
            if (n == 0 || W == 0) {
                return 0;
            }
            if (wt[n - 1] > W) {
                return knapsack(val, wt, W, n - 1); // Exclude the item
            } else {
                // Include the item or exclude the item, and return the maximum of both choices
                return Math.max(
                    val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1), // Include the item
                    knapsack(val, wt, W, n - 1) // Exclude the item
                );
            }
        }
    
        public static void main(String[] args) {
            int[] val = {60, 100, 120};
            int[] wt = {10, 20, 30};
            int W = 50; 
            int n = val.length; 
            int maxValue = knapsack(val, wt, W, n);
            System.out.println("The maximum value that can be put in the knapsack is: " + maxValue);
        }
    }
    

