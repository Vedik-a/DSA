public class palindrome {
        public static boolean isPalindrome(String str) {
            return checkPalindrome(str, 0, str.length() - 1);
        }
        private static boolean checkPalindrome(String str, int start, int end) {
            if (start >= end) {
                return true;
            } 
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            } 
            return checkPalindrome(str, start + 1, end - 1);
        }
    
        public static void main(String[] args) {
            String s1 = "racecar";
            String s2 = "hello";
    
            System.out.println(s1 + " is palindrome? " + isPalindrome(s1));  // true
            System.out.println(s2 + " is palindrome? " + isPalindrome(s2));  // false
        }
    }
    

