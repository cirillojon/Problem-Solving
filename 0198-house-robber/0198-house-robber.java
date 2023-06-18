class Solution{
    public int rob(int[] nums){
        int r = 0; Map<Integer, Integer> m = new HashMap<>();
        r = helper(nums, m, r, nums.length-1); return r; }
    public int helper(int[] nums, Map<Integer, Integer> m, int r, int i){
        if(i == 0) return nums[0];
        if(i == 1) return Math.max(nums[0], nums[1]);
        if(m.containsKey(i)) return m.get(i);
        r = Math.max(nums[i] + helper(nums, m, r, i -2), helper(nums, m, r, i - 1));
        m.put(i, r); return r;
    }
}