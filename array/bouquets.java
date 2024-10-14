public class bouquets {
        boolean ispossible(int[] arr, int m, int k,int mid)
         {
             int adj=0,bc=0;
             for (int i=0;i<arr.length;i++){
                 if(arr[i]<=mid)
                 {
                     adj++;
                     if(adj==k)
                    { bc++;
                    if(bc==m){
                     return true;
                    }adj=0;
                 }
                 }
     else{
         adj=0;
     }
             }return false;
         }
         public int minDays(int[] arr, int m, int k) {
          if(m*k>arr.length){
             return -1;
          }
          int l=arr[0],h=arr[0];
          for(int i=0;i<arr.length;i++){
            if(arr[i]<l){
             l=arr[i];
            }
            if(arr[i]>h)
            {
             h=arr[i];
            }}
            int res=-1;
            while(l<=h){
           int mid=(l+h)/2;
            if(ispossible(arr,m,k,mid)==true)//we have found the solution but our duty is to minimize the solution
            { res=mid;
     h=mid-1;
            }
            else{
             l=mid+1;
            }
            } 
            return res;
         }
         public static void main(String[] args) {
            bouquets obj = new bouquets();  // Create an object to call the non-static method
        int[] arr = {2, 4, 5, 7, 1};
        int m = 2, k = 2;
        int result = obj.minDays(arr, m, k);  // Call the method from the object
        System.out.println("Minimum number of days: " + result);
             }
     }

