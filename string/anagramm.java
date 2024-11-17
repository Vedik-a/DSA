import java.util.Arrays;

public class anagramm {
      public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }
    public static void main(String[] args) {
        anagramm an = new anagramm();
        System.out.println(an.isAnagram("listen", "silent"));
    }
}
