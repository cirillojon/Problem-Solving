class Solution {
    public long zeroFilledSubarray(int[] nums) {

        boolean wasLastZero = false; int count = 1; long res = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0 && wasLastZero == true)
            {
                count++; res += count;
            }
            
            if(nums[i] == 0 && wasLastZero == false)
            {            
                count = 1; wasLastZero = true; res++;
            }
            
            if(nums[i] != 0)
            {
                wasLastZero = false;
                count = 0;
            }
        }
        return res;
    }
}