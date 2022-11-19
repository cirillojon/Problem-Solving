class Solution {
    public int search(int[] nums, int target) 
    {
    
    int res = IntStream.of(nums).boxed().collect(Collectors.toList()).indexOf(target);
        return res;
        
    }
}