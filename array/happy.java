class happy {
    public static boolean isHappy(int n) {
        while(n>9){
            int s=0;
            while(n>0){
                int x=n%10;
                s=s+(x*x);
                n=n/10;
            }
            if(s==1){
                return true;
            }
            n=s;
        }
         return (n == 1 || n == 7) ? true : false;
       
    }
    public static void main(String[] args) {
        int number = 19; // Replace with the number you want to check
        if (isHappy(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
     
    }
}
