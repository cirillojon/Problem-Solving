class Solution{
    public int rob(int[] nums){
        int res = 0; Map<Integer, Integer> cache = new HashMap<>();
        res = helper(nums, cache, res, nums.length - 1); return res; }
    public int helper(int[] nums, Map<Integer, Integer> cache, int res, int index){
        if(index == 0) return nums[0]; if(index == 1) return Math.max(nums[0], nums[1]);
        if(cache.containsKey(index)) return cache.get(index);
        res  = Math.max(nums[index] + helper(nums, cache, res, index - 2), helper(nums, cache, res, index - 1));
        cache.put(index, res); return res;
    }
}