class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length == 0 || nums == null) return res;
        helper(res, nums, new ArrayList<>(), new boolean[nums.length]);
        return res;
    }
    public void helper(List<List<Integer>> res, int[] nums, List<Integer> list, boolean[] used){
        if(nums.length == list.size()) { 
            boolean flag = false;
            for(int i = 0; i < res.size(); i++)
                if(res.get(i).equals(list)) 
                    flag = true; if(!flag) 
            res.add(new ArrayList<>(list)); return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            used[i] = true; list.add(nums[i]);
            helper(res, nums, list, used);
            used[i] = false; list.remove(list.size() - 1);
        } return;
    }
}