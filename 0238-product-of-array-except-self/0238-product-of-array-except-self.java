class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] from_start = new int[nums.length]; 
        int[] from_end = new int[nums.length];
        from_start[0] = nums[0]; from_end[nums.length-1] = nums[nums.length-1];
        for(int i = 0; i < nums.length-1; i++){
           from_start[i+1] = from_start[i] * nums[i+1];
           from_end[nums.length-2-i] = from_end[nums.length-1-i] * nums[nums.length-2-i];}
        for(int i = 0; i < nums.length; i++){
            if(i == 0) {nums[i] = from_end[1]; continue;}
            if(i == nums.length-1) {nums[i] = from_start[nums.length-2]; continue;}
            nums[i] = from_start[i-1] * from_end[i+1];
        } return nums;
    }
}