class Solution {
    public int maximizeSum(int[] nums, int k) {
        int res = 0; Arrays.sort(nums);
        for(int i = 0; i < k; i++) res += nums[nums.length-1]++;
        return res;
    }
}