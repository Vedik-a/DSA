public class longestPalindrome {
    int longestPalindrome(String s) {
        int[] charCounts = new int[128]; // ASCII size array for case-sensitive counting
        int length = 0;

        // Count frequencies of each character
        for (char c : s.toCharArray()) {
            charCounts[c]++;
        }

        // Calculate the length of the longest palindrome
        for (int count : charCounts) {
            length += (count / 2) * 2; // Add the largest even part of the count
            if (length % 2 == 0 && count % 2 == 1) {
                length++; // Add 1 for a single odd character in the center
            }
        }
        
        return length;
    }
public static void main(String[] args) {
    longestPalindrome lp = new longestPalindrome();
    System.out.println(lp.longestPalindrome("abccccdd")); // Output: 7
    
}
}
