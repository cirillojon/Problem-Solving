class Solution {
    public long zeroFilledSubarray(int[] nums) {

        boolean bool = false; int count = 1; long res = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0 && bool == true)
                res += ++count;
            
            if(nums[i] == 0 && bool == false)
            {            
                count = 1;
                bool = true;
                res++;
            }
            
            if(nums[i] != 0)
            {
                bool = false;
                count = 0;
            }
        }
        return res;
    }
}