public class powerof4 {
    public boolean isPowerOfFour(int n) {
        if(n==1){
             return true;
         }
         if(n==0 || n%4!=0){
             return false;
         }
         return isPowerOfFour(n/4);  
     }
public static void main(String[] var0) {
    powerof4  var1 = new powerof4();
    System.out.println(var1.isPowerOfFour(27));
    System.out.println(var1.isPowerOfFour(18));
    System.out.println(var1.isPowerOfFour(1));
    System.out.println(var1.isPowerOfFour(64));
 }
}

