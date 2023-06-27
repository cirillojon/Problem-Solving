class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = -50; Arrays.sort(nums); int sum = 0;
        if(target < nums[0] + nums[1] + nums[2])
            return nums[0] + nums[1] + nums[2];
        if(target > nums[nums.length-1] + nums[nums.length-2] + nums[nums.length-3])
            return nums[nums.length-1] + nums[nums.length-2] + nums[nums.length-3];
        for(int i = 0; i < nums.length; i++){
            int j = i + 1; int k = nums.length-1;
            while(j < k){
                sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    return sum;
                }
                else if(sum > target) k--;
                else j++;

                if((Math.abs(target - sum) < Math.abs(target - res)))
                res = sum;
            }
        } return res;
    }
}