import java.util.Arrays;
public class xorQ {
    public int[] xorQueries(int[] arr, int[][] queries) 
    //brackets [] is used to indicate that the method returns an array of integers
    {
        for(int i=1;i<arr.length;i++)
      {
          arr[i]=arr[i-1]^arr[i];//xor using prefix array 
      }
      int xor []= new int[queries.length];
      for(int i=0;i<queries.length;i++)
      {
          int l=queries[i][0] , r=queries[i][1];
          if(0<l)
          {
              xor[i]=arr[r]^arr[l-1];
          }
          else
          {
              xor[i]= arr[r];
          }
      }
      return(xor);
  }
  public static void main(String[] args) {
    xorQ xq = new xorQ();
        
    int[] arr = {1, 3, 4, 8};
    int[][] queries = {{0, 1}, {1, 2}, {0, 3}, {3, 3}};

    int[] result = xq.xorQueries(arr, queries);
    System.out.println("XOR Results: " + Arrays.toString(result));
  }
}
