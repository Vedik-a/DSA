public class unique {
    public int firstUniqChar(String s) {
        for (int i = 0, length = s.length(); i < length; i++) {
             int c=1;
        for (int j = 0; j < length; j++)
           { if (i != j && s.charAt(i) == s.charAt(j))
               { c++ ;
        break;
    }
}
if (c==1)
    return i;
    } 
    return -1;
    }
    public static void main(String[] args) {
        unique u = new unique();
        System.out.println(u.firstUniqChar("loveleetcode")); // 2
    }
}
