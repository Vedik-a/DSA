import java.util.Arrays;
public class lcp {

        public static String longestCommonPrefix(String[] strs) {
            Arrays.sort(strs);//we have sort the array therefore we can simply compare 1st and last string
            String s1 = strs[0];
            String s2 = strs[strs.length-1];
            int idx = 0;
            while(idx < s1.length()  && idx < s2.length()){
                if(s1.charAt(idx) == s2.charAt(idx)){
                    idx++;
                } else {
                    break;
                }
            }
            return s1.substring(0, idx);
        }
        public static void main(String[] args) {
            String[] strs={"car","cat","cap"};
            String result = longestCommonPrefix(strs);  // Call the method
            System.out.println("Longest Common Prefix: " + result);
             }
    } 

