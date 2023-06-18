class Solution{
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0) return res;
        helper(res, nums, new ArrayList<>(), new boolean[nums.length]);
        return res;
    }
    public void helper(List<List<Integer>> res, int[] nums, List<Integer> list, boolean[] used){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i] == true) continue;
            list.add(nums[i]); used[i] = true;
            helper(res, nums, list, used);
            list.remove(list.size() - 1); used[i] = false;
        }
        return;
    }
}