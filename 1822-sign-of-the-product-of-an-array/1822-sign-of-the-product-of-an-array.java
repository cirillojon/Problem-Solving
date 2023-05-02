class Solution {
    public int arraySign(int[] nums) {
      int res = 1;
      for(int n : nums) res *= signFunc(n);
      return res;
    }
    public int signFunc(int n){
      if(n > 0) return 1;
      if(n == 0) return 0;
      return -1;
    }
}