public class uncommonSub {
    public int findLUSlength(String a, String b)
    {
        int la=a.length();
        int lb=b.length();
        if(a.equals(b)){
            return -1;
        }
        else{
            if (la>lb){
                return la;
            }
            else{
                return lb;
            }

        }
        
    }
    public static void main(String[] args) {
        uncommonSub s=new uncommonSub();
        System.out.println(s.findLUSlength("abc","cba")); 
    }
}
