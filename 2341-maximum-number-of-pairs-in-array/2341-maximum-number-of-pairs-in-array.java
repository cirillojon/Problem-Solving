class Solution {
    public int[] numberOfPairs(int[] nums) {
    int[] res = new int[2]; res[1] = nums.length;
    ArrayList<Integer> list = new ArrayList<>(Arrays.stream(nums).boxed().collect(Collectors.toList()));
    for(int i = 0; i < nums.length; i++)
        if (list.get(i) != -2 && list.indexOf(nums[i]) != list.lastIndexOf(nums[i]) && list.lastIndexOf(nums[i]) != -1){
                list.set(list.lastIndexOf(nums[i]),-2); res[0]++; list.set(i,-2); res[1] -= 2;
        } return res;
    }
}