class Solution {
    public int pivotIndex(int[] nums) {
        
   
        int total = 0; int left = 0;
        int len = nums.length;
        
        for(int i = 0; i < len; i++)
            total += nums[i];
        
        
        for(int i = 0; i < len; i++)
        {
        
            if(left == total - left - nums[i])
            {
                return i;
            }
            
            left = left + nums[i];
            
        }
        
        
        
        return -1;     
    }
}




