public class revStr2 {
    public String reverseStr(String s, int k) {
        // Convert the string to a character array for easy manipulation
       char[] chars = s.toCharArray();

       // Process every 2k characters
       for (int i = 0; i < chars.length; i += 2 * k) {
           // Determine the end of the section to reverse (either k characters or less if near the end)
           int end = Math.min(i + k - 1, chars.length - 1);
           reverse(chars, i, end);
       }

       // Convert the character array back to a string and return
       return new String(chars);
   }

   // Helper method to reverse characters from start to end in the array
void reverse(char[] chars, int start, int end) {
       while (start < end) {
           char temp = chars[start];
           chars[start] = chars[end];
           chars[end] = temp;
           start++;
           end--;
       }
   }
   public static void main(String[] args) {
       revStr2 obj = new revStr2();
       System.out.println(obj.reverseStr("abcdefg", 2));
   }
}
