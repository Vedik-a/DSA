public class licenseKey {
    public String licenseKeyFormatting(String s, int k) {
        // Convert all characters to uppercase
        s = s.toUpperCase();
        String result = ""; // Result string to store reformatted license key
        int count = 0; // Counter to track group size

        // Traverse the string from end to start
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            // Ignore dashes in the input
            if (c != '-') {
                // Add character to the result
                result = c + result;
                count++; // Increase character count for the current group

                // Insert a dash if group size k is reached and it's not the end of the string
                if (count == k) {
                    result = "-" + result;
                    count = 0; // Reset count for new group
                }
            }
        }

        // Remove leading dash if present
        if (!result.isEmpty() && result.charAt(0) == '-') {
            result = result.substring(1);
        }

        return result;
    }
    public static void main(String[] args) {
        licenseKey l = new licenseKey();
        System.out.println(l.licenseKeyFormatting("2-4A0r7-4k",4));
    }
}
