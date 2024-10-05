public class PrimeInRange {

    // Recursive method to check if a number is prime
    public static boolean isPrime(int num, int divisor) {
        // Base cases
        if (num < 2) {
            return false; // Numbers less than 2 are not prime
        }
        if (divisor == 1) {
            return true; // If divisor reaches 1, number is prime
        }
        if (num % divisor == 0) {
            return false; // If divisible, number is not prime
        }
        // Recursive case: check with a smaller divisor
        return isPrime(num, divisor - 1);
    }

    // Recursive method to check and print primes from 1 to n using only 1 argument
    public static void checkPrimesUpTo(int n) {
        // Base case: if n < 1, end recursion
        if (n < 1) {
            return;
        }
        // Recursive case: check if n is prime, then recurse for n-1
        if (isPrime(n, n / 2)) {
            System.out.println(n + " is a prime number");
        }
        checkPrimesUpTo(n - 1); // Recursive call to check for the next lower number
    }

    public static void main(String[] args) {
        int n = 20; // Example: Find primes up to 20
        System.out.println("Prime numbers from 1 to " + n + ":");
        checkPrimesUpTo(n);
    }
}

