class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> res = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        int val = nums.length/3; 
         for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i]) + 1);
            if(map.get(nums[i]) > val) res.add(nums[i]);
         }
        return new ArrayList<>(res);
    }
}