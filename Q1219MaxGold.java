public class Q1219MaxGold {

    class Q1219MaxGold {
        public int getMaximumGold(int[][] grid) {
            int maxGold=0;
            for(int row=0;row<grid.length;row++)
            {
                for(int col=0;col<grid[row].length;col++)
                {
                    if(grid[row][col]!=0)
                    {
                        maxGold=Math.max(maxGold,getMaximumGoldNeigh(grid,row,col));
                    }
                }
            }
            return maxGold;
            
        }
        public static int getMaximumGoldNeigh(int [][]grid,int row,int col)
        {
            if(row<0 || col<0 || row>=grid.length || col>=grid[row].length || grid[row][col]<=0)
            {
                return 0;
            }
            int orig = grid[row][col];  
            grid[row][col]=-1;
            int maxGoldVal=Math.max(
                Math.max(getMaximumGoldNeigh(grid,row-1,col),getMaximumGoldNeigh(grid,row+1,col)),
                Math.max(getMaximumGoldNeigh(grid,row,col-1),getMaximumGoldNeigh(grid,row,col+1)));
            grid[row][col]=orig;
            return orig+maxGoldVal;
        }
        
    }
    
}