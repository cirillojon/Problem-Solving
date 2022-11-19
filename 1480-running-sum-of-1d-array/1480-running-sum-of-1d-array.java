class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int count = 0;
        
        for(int i = 0; i < nums.length; i++)
        {
            count = nums[i] + count;
            sum[i] = count;
        }
        
        return sum;
        
    }
}