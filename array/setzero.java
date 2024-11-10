import java.util.Arrays;
public class setzero {
    public void setZeroes(int[][] matrix) {
        int row[]= new int[matrix.length];
        int col[]= new int[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            row[i]=0;
        }
        for(int i=0;i<matrix[0].length;i++){
            col[i]=0;
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<row.length;i++){
            for(int j=0;j<col.length;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }
    private void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void main(String[] args) {
        setzero obj = new setzero();
        int[][] matrix = {{0, 1}, {1, 2}, {0, 3}, {3, 3}};
        
        obj.setZeroes(matrix);
        obj.printMatrix(matrix); // Print the modified matrix
    }
}
