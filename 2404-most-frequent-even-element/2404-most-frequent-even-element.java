class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max = 0; int res = -1; 
        for(int i = 0; i < nums.length; i++)
            if(nums[i] % 2 == 0){
                if(map.containsKey(nums[i]))
                    map.put(nums[i], map.get(nums[i])+1);
                else map.put(nums[i], 1);
            }  
        for(int i = 0; i < nums.length; i++)
            if(nums[i] % 2 == 0 && map.get(nums[i]) >= max){ 
                if(map.get(nums[i]) == max && nums[i] < res){
                    res = nums[i]; max = map.get(nums[i]);
                    continue;
                }
                if(map.get(nums[i]) == max && nums[i] >= res) continue;
                max = map.get(nums[i]); res = nums[i];
            }
        return res;
    }
}