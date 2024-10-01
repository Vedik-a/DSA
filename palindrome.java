public class palindrome {
    
        // Function to check if a string is a palindrome
        public static boolean isPalindrome(String str) {
            // Call the helper function with start and end indices
            return checkPalindrome(str, 0, str.length() - 1);
        }
    
        // Recursive helper function to check if substring is a palindrome
        private static boolean checkPalindrome(String str, int start, int end) {
            // Base case 1: If start index is greater than or equal to end index, it's a palindrome
            if (start >= end) {
                return true;
            }
    
            // Base case 2: If the characters at start and end are different, it's not a palindrome
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
    
            // Recursive case: Check the substring excluding the current start and end characters
            return checkPalindrome(str, start + 1, end - 1);
        }
    
        public static void main(String[] args) {
            // Example test cases
            String s1 = "racecar";
            String s2 = "hello";
    
            System.out.println(s1 + " is palindrome? " + isPalindrome(s1));  // true
            System.out.println(s2 + " is palindrome? " + isPalindrome(s2));  // false
        }
    }
    

