class Solution {
    public int[] getAverages(int[] nums, int k) {
      if(k == 0) return nums; if(k > nums.length) 
      return IntStream.range(0, nums.length).map(i -> -1).toArray();
      int[] avg = new int[nums.length]; 
      long[] sums = new long[nums.length];
      for(int i = 0; i < nums.length; i++)
        if(i < k || (nums.length - i - 1 < k)) 
          avg[i] = -1;
      long sum = 0; int trailing_index = 0;
      for(int i = 0; i < nums.length; i++){
        if(i < (k*2+1)) sum += nums[i];
        else{
          sum += nums[i]; sum -= nums[trailing_index++];
        } sums[i] = sum;
      }
      for(int i = 0; i < avg.length - k; i++)
        if(avg[i] == 0) avg[i] = (int)(sums[i + k]/(long)(k*2+1)); 
          return avg;
    }
}