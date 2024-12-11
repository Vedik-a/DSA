
public class equalArray {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = "";
        String str2 = "";
        
        for (String s : word1) {
            str1 += s; // Concatenate each string in word1
        }
        
        for (String s : word2) {
            str2 += s; // Concatenate each string in word2
        }
        
        // Return comparison result of both concatenated strings
        return str1.equals(str2);
    }

    public static void main(String[] args) {
        equalArray obj = new equalArray();
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        
        // Call the method and print the result
        boolean result = obj.arrayStringsAreEqual(word1, word2);
        System.out.println("Are the two string arrays equal? " + result);
    }
}
