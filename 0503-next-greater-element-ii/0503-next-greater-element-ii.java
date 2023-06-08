class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        int index = 0; boolean flag = false; int count = 0;
        for(int i = 0; i < nums.length; i++){
            index = i + 1;
            while(count != nums.length-1 && flag == false){
                if(index == nums.length) index = 0;
                if(nums[index] > nums[i]){
                    res[i] = nums[index];
                    flag = true;
                }
                index++; count++;
            }
            if(count == nums.length || flag == false) res[i] = -1;
            count = 0; flag = false;
            
        }
        return res;
    }
}