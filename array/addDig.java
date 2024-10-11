public class addDig {
  

    public static int addDigits(int n) {
        if(n < 10) return n;
        int ans = 0;
        while(n != 0) {
             ans = ans + (n % 10);
             n /= 10;
        } 
        return addDigits(ans);
     }
     public static void main(String[] args) {
   int n=38;
   int result = addDigits(n);
   System.out.println("The sum of the digits of " + n + " is: " + result);
    }}
    

