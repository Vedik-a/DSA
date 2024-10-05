public class HarmonicNumber {

    // Recursive method to calculate the nth harmonic number
    public static double harmonicNumber(int n) {
        // Base case: the 1st harmonic number is 1
        if (n == 1) {
            return 1.0;
        }
        // Recursive case: nth harmonic number is 1/n + (n-1)th harmonic number
        return 1.0 / n + harmonicNumber(n - 1);
    }

    public static void main(String[] args) {
        int n = 5; // Example: Find the 5th harmonic number
        double result = harmonicNumber(n);
        System.out.println("The " + n + "th harmonic number is: " + result);
    }
}

