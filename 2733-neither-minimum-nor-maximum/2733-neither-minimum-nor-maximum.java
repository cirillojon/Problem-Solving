class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length <=2 ) return -1; 
        
        if(nums[0] > nums[1] && nums[0] < nums[2])
            return nums[0];
        if(nums[0] > nums[2] && nums[0] < nums[1])
            return nums[0];
        if(nums[1] > nums[0] && nums[1] < nums[2])
            return nums[1];
        if(nums[1] > nums[2] && nums[1] < nums[0])
            return nums[1];
        if(nums[2] > nums[0] && nums[2] < nums[1])
            return nums[2];
        if(nums[2] > nums[1] && nums[2] < nums[0])
            return nums[2];
        
        return -1;
    }
}