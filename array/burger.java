import java.util.*;
public class burger {
        public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
            List<Integer> ans =new ArrayList<>();
            if(tomatoSlices%2==1||cheeseSlices>tomatoSlices){
                return ans;
            }
            int a=(tomatoSlices-(2*cheeseSlices))/2;
            int b=(cheeseSlices-a);
            if(a>=0&&b>=0){
                ans.add(a);
                ans.add(b);
            }
            return ans;
        }
        public static void main(String[] args) {
            int tomatoSlices=5;
            int cheeseSlices=7;
            burger bg=new burger();
            List<Integer> result = bg.numOfBurgers(tomatoSlices, cheeseSlices);

            System.out.println("Number of Jumbo Burgers: " + (result.isEmpty() ? "None" : result.get(0)));
            System.out.println("Number of Small Burgers: " + (result.isEmpty() ? "None" : result.get(1)));    
        }
    }

