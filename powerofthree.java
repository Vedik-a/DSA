public class powerofthree {
    
        public boolean isPowerOfThree(int n) {
            if(n==1){
                return true;
            }
            if(n==0 || n%3!=0){
                return false;
            }
            return isPowerOfThree(n/3);
        }
        public static void main(String[] args) {
            powerofthree  p3 = new powerofthree();
            System.out.println( p3.isPowerOfThree(27));  
            System.out.println(p3.isPowerOfThree(18));  
            System.out.println(p3.isPowerOfThree(1));   
            System.out.println(p3.isPowerOfThree(64)); 
    }}

