public class maxWater {
    public int maxArea(int[] height) {
        int i=0;int max=0;
        int j=height.length - 1;
        while(i<j)
        {
int c=Math.min(height[i],height[j]) * (j-i);
max =Math.max(max,c);
if(height[i]<height[j])
i++;
else
j--;
        }
        return max;
    }
    public static void main(String[] args) {
        maxWater m = new maxWater();
        int[] height = {1,8,6,2,5,4,8};
        System.out.println("The maximum area is: " + m.maxArea(height));
    }
}
