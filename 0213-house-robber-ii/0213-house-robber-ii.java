class Solution {
    int res = 0;
    public int rob(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int one =  rob_helper(nums, nums.length-2, map); map.clear();
        int two =  rob_helper(IntStream.rangeClosed(1, nums.length)
        .map(i -> nums[nums.length - i]).toArray(), nums.length-2, map);
        return Math.max(one, two);
    }
    public int rob_helper(int[] nums, int i, Map<Integer, Integer> map){
        if(i == 0) return nums[0];
        if(i == 1) return Math.max(nums[0], nums[1]);
        if(nums.length <= 3) return Arrays.stream(nums).max().orElse(-1);
        if(map.containsKey(i)) return map.get(i);
        res = Math.max(nums[i] + rob_helper(nums, i-2, map), rob_helper(nums, i-1, map));
        map.put(i, res); return res;
    }
}