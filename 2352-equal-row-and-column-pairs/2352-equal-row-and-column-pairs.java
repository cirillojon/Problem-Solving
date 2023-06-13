class Solution {
    public int equalPairs(int[][] grid) {
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            int[] temp = new int[grid[0].length];
            for(int j = 0; j < temp.length; j++) 
                temp[j] = grid[j][i];
            for(int y = 0; y < grid.length; y++) 
                if(Arrays.equals(temp, grid[y])) res++;
        } return res;
    }
}