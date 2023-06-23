class Solution {
    public int maxSubArray(int[] nums) {
        int curr_max = nums[0], end_max = nums[0];
        for(int i = 1; i < nums.length; i ++){
            end_max = Math.max(nums[i], nums[i] + end_max);
            curr_max = Math.max(curr_max, end_max);
        } return curr_max;
    }
}