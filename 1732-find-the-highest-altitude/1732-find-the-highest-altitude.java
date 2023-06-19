class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length+1];
        int res = 0; int total_g = 0;
        for(int i = 0; i < gain.length; i++){
            total_g += gain[i];
            if(total_g > res) res = total_g;
        } return res;
    }
}