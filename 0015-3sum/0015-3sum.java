class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        if(nums.length == 0) return new ArrayList<>(set);
        Arrays.sort(nums);
        for(int i = 0;i < nums.length - 2; i++){
            int j = i + 1; int y = nums.length - 1;
            while(j < y){
                int sum = nums[i] + nums[j] + nums[y];
                if(sum == 0) set.add(Arrays.asList(nums[i], nums[j++], nums[y--]));
                else if(sum > 0) y--;
                else if(sum < 0) j++;
            }
        } return new ArrayList<>(set);
    }
}