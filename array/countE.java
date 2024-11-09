import java.util.Arrays;
public class countE {
    public int countElements(int[] nums) {
        int count =0;
        Arrays.sort(nums);
        int l = nums[0];
        int r = nums[nums.length-1];
        for(int i=1 ; i< nums.length -1 ; i++){
          if(nums[i] >l && nums[i]<r){
              count++;
          }
        }
        return count;
    }
    public static void main(String[] args) {
        countE c = new countE();
        int[] nums={3,5,6,7,8,3,1,0};
        System.out.println(c.countElements(nums));
    }
}
