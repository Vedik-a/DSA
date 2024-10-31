public class eqvalue {
    public int smallestEqual(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
if(i%10==nums[i])
{
 return i;
}
        }
       return -1;
    }
    public static void main(String[] args) {
        eqvalue eq=new eqvalue();
        int[] nums= {3,6,7,5,2};
        int result = eq.smallestEqual(nums);
        System.out.println("Index of smallest equal value: " + result);
    }
}
