public class CountOccurrences {

    // Recursive method to count occurrences of a character in a string
    public static int countOccurrences(String str, char ch) {
        // Base case: if the string is empty, return 0
        if (str.isEmpty()) {
            return 0;
        }

        // Return 1 if the first character matches, otherwise return 0,
        // and make a recursive call to the rest of the string
        return (str.charAt(0) == ch ? 1 : 0) + countOccurrences(str.substring(1), ch);
    }

    public static void main(String[] args) {
        String inputString = "recursion is fun, and recursion is powerful";
        char charToCount = 'r'; // Example: count occurrences of 'r'

        int occurrences = countOccurrences(inputString, charToCount);
        System.out.println("The character '" + charToCount + "' occurs " + occurrences + " times.");
    }
}

