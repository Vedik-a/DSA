public class island {
    public void poison(char[][] grid,int i,int j){
        if(i<grid.length-1 && grid[i+1][j]=='1'){
            grid[i+1][j]='2';
            poison(grid,i+1,j);
        }
        if(j<grid[0].length-1 && grid[i][j+1]=='1'){
            grid[i][j+1]='2';
            poison(grid,i,j+1);
        }
        if(j!=0 && grid[i][j-1]=='1'){
            grid[i][j-1]='2';
            poison(grid,i,j-1);
        }
        if(i>0 && grid[i-1][j]=='1'){
            grid[i-1][j]='2';
            poison(grid,i-1,j);
        }
    }

    public int numIslands(char[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    grid[i][j]='2';
                    poison(grid,i,j);
                    count++;
                }

            }
        }
        return count;
    }
    public static void main(String[] args) {
        // Example grid
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };

        island iland = new island();
        int numberOfIslands = iland.numIslands(grid);
        System.out.println("Number of islands: " + numberOfIslands);
    }
}