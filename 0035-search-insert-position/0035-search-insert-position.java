class Solution {
    public int searchInsert(int[] nums, int target) {
        
        
        
        int counter = 0;
        
        for (int  i = 0; i < nums.length; i++)
        {
            
            if(nums[i] == target)
            {
                return i;
            }
            
            if(nums[i] < target)
            counter++;
            
            if(nums[i] > target)
                return counter;
        }
        
        
        
        return counter;
        
        
        
    }
}