class Solution {
    public int findPairs(int[] nums, int k) {
        int count = 0;
        Set<Pair<Integer, Integer>> set = new HashSet<Pair<Integer, Integer>>();
        for(int i = 0; i < nums.length; i++)
            for(int j = 0; j < nums.length; j++)
               if(i != j && Math.abs(nums[i] - nums[j]) == k){
                  Pair<Integer, Integer> p = new Pair<Integer, Integer>
                  (Math.min(nums[i],nums[j]), Math.max(nums[i],nums[j]));
                  if(set.add(p)) count++; 
                } 
        return count;
    }
}