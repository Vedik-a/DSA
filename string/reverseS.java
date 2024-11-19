import java.util.Arrays;

public class reverseS {
    public void reverseString(char[] s) {
        int c=0,e=s.length-1;
        while(c<=e)
        {
            char t = s[c];
s[c]=s[e];
s[e]=t;
c++;
e--;
        }
    }
    public static void main(String[] args) {
        reverseS obj = new reverseS();
       char[] s = {'h', 'e', 'l', 'l', 'o'};
        obj.reverseString(s);
        System.out.println(Arrays.toString(s)) ;
    }
}
