class Solution{
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0 || nums == null) return res;
        helper(nums, res, new ArrayList<>(), new boolean[nums.length]);
        return res;
    }
    public void helper(int[] nums, List<List<Integer>> res, List<Integer> list, boolean[] used){
        if(nums.length == list.size()){
            res.add(new ArrayList<>(list)); return;
        }
        for(int i = 0; i < nums.length; i++){
            if (used[i]) continue;
            used[i] = true; list.add(nums[i]);
            helper(nums, res, list, used);
            list.remove(list.size() - 1); used[i] = false;
        }
        return;
    }
}