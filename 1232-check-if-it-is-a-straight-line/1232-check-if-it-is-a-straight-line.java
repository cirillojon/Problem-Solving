class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int[] base = {coordinates[0][0], coordinates[0][1]};
        int[] second = {coordinates[1][0], coordinates[1][1]};
        int slope = (calc_slope(base, second));
        for(int i = 0; i < coordinates.length; i++)
            for(int y = 0; y < coordinates.length; y++ )
                if(i != y && calc_slope(coordinates[i], coordinates[y]) != slope)
                    return false;
        return true;
    }

    public int calc_slope(int[] base, int[] c){
        int x1 = base[0]; int x2 = c[0];
        int y1 = base[1]; int y2 = c[1];
        if(x2-x1 == 0) return 0;
        return ((y2-y1) / (x2-x1));
    }   
}