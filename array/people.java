import java.util.Arrays;
public class people {
    public static String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(heights[j]>heights[i]){
                    String temp = names[i];
                    names[i]=names[j];
                    names[j]=temp;
                    int tem = heights[i];
                    heights[i] = heights[j];
                    heights[j] = tem;
                }
            }
        }
        return names;
    }
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
String[] r =sortPeople(names,heights);
System.out.println("Sorted names by height: " + Arrays.toString(r));
         }
} 
    

