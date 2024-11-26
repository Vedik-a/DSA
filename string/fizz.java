import java.util.ArrayList;
import java.util.List;

public class fizz {
       public List<String> fizzBuzz(int n) {
        List<String> myList = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                myList.add("FizzBuzz");
            }
            else if(i%3==0){
                myList.add("Fizz");
            }
            else if(i%5==0){
                myList.add("Buzz");
            }
            else{
                myList.add(String.valueOf(i));
            }
        }
        return myList;
    }
    public static void main(String[] args) {
        fizz f = new fizz();
        List<String> result = f.fizzBuzz(20);
        System.out.println(result);
    }
}
