class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<Integer>();
        boolean res = false;

        for(int i = 0; i < nums.length; i++)
        {
            if(!set.add(nums[i]))
                res = true;
        }    
            return res;
    }
}