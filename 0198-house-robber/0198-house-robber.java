class Solution{
    public int rob(int[] nums){
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        result = helper(map, nums, nums.length - 1, result);
        return result;
    }
    public int helper(Map<Integer, Integer> map, int[] nums, int index, int result){
        if(index == 0) return nums[0];
        if(index == 1) return Math.max(nums[0], nums[1]);
        if(map.containsKey(index)) return map.get(index);
        result = Math.max(nums[index] + helper(map, nums, index - 2, result), helper(map,nums, index - 1, result));
        map.put(index, result); return result;
    }
}