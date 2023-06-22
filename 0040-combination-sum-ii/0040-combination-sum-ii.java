class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, res, target, new ArrayList<>(), 0);
        return new ArrayList<>(res);
    }
    public void helper(int[] c, List<List<Integer>> res, int target, List<Integer> list, int index){
       if(target == 0){
           res.add(new ArrayList<>(list)); 
           return;
       }
        if(target < 0) return;
        for(int i = index; i < c.length; i++){
            if(i > index && c[i] == c[i-1]) continue;
            list.add(c[i]); 
            helper(c, res, target - c[i], list, i + 1);
            list.remove(list.size() - 1); 
        } 
    } 
}