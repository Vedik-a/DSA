public class shuffle {
    public String restoreString(String s, int[] indices) {
      
        char[] a= new char[indices.length];
        for(int i=0;i<indices.length;i++)
        { 
            a[indices[i]]=s.charAt(i);
        }
        return new String(a);
     }
     public static void main(String[] args) {
         shuffle s = new shuffle();
         String s1 = "codeleet";
     }
}
