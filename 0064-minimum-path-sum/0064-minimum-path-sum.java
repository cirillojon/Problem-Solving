class Solution {
    public int minPathSum(int[][] grid) {
        
        int[][] arr = new int[grid.length][grid[0].length];


int count = 0;

    for(int r = 0; r < grid.length; r++)
        {
              for(int c = 0; c < grid[0].length; c++)
                {
                    System.out.print(grid[r][c]+" ");
                    count = grid[r][c] + count;
                }
            System.out.println();
        }

        if(count == 0)
        return 0;
          
System.out.println();
        for(int i = 0; i < grid.length; i++)
        {
            if(i>0)
            {
                arr[i][0] = arr[i-1][0] + grid[i][0];
            }
           
            if(i==0)
            {
             arr[0][i] = arr[0][i] + grid[0][i];
            }
        }

        for(int i = 0; i < grid[0].length; i++)
        {
            if(i>0)
            arr[0][i] = arr[0][i-1] + grid[0][i];

            if(i==0)
            {
             continue;
            }
        }


    for(int r = 0; r < grid.length; r++)
        {
              for(int c = 0; c < grid[0].length; c++)
                {
                    System.out.print(arr[r][c]+" ");
                }
            System.out.println();
        }
          

        for(int r = 1; r < grid.length; r++)
        {
              for(int c = 0; c < grid[0].length; c++)
                {
                 
                   if(arr[r][c] == 0 && !(c==0))
                   {
                       
                    arr[r][c] = grid[r][c]+ Math.min(arr[r][c-1],arr[r-1][c]);

                   }
                }
            System.out.println();
        }



        for(int r = 0; r < grid.length; r++)
        {
              for(int c = 0; c < grid[0].length; c++)
                {
                    System.out.print(arr[r][c]+" ");
                }
            System.out.println();
        }
          
                

        return arr[grid.length-1][grid[0].length-1];
    }
} 