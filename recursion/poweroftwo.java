public class poweroftwo {

    public boolean isPowerOfTwo(int n) {
        // Base case: if n is 1, it's a power of two
        if (n == 1) {
            return true;
        }
        // If n is less than 1 or not divisible by 2, it's not a power of two
        if (n < 1 || n % 2 != 0) {
            return false;
        }
        // Recursive call, dividing n by 2
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        poweroftwo powTwo = new poweroftwo();
        System.out.println(powTwo.isPowerOfTwo(16));  // Output: true
        System.out.println(powTwo.isPowerOfTwo(18));  // Output: false
        System.out.println(powTwo.isPowerOfTwo(1));   // Output: true
        System.out.println(powTwo.isPowerOfTwo(64));  // Output: true
    }
}
