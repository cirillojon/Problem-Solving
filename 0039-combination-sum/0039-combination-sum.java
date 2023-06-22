class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> res = new HashSet<>();
        helper(candidates, res, target, new ArrayList<>(), 0);
        return new ArrayList<>(res);
    }
    public void helper(int[] c, Set<List<Integer>> res, int target, List<Integer> list, int sum){

       if(sum == target){
           List<Integer> temp = new ArrayList<>(list);
           Collections.sort(temp);
           res.add(new ArrayList<>(temp));
       }
             
        for(int i = 0; i < c.length; i++){
            if(sum + c[i] > target) continue;
            list.add(c[i]); sum += c[i];
            helper(c, res, target, list, sum);
            list.remove(list.size() - 1); sum -= c[i];
        } return;
    } 
}