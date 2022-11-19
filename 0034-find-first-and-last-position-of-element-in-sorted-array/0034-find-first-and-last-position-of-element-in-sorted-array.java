class Solution {
    public int[] searchRange(int[] nums, int target) {      
        
    return new int[] {IntStream.of(nums).boxed().collect(Collectors.toList()).indexOf(target),IntStream.of(nums).boxed().collect(Collectors.toList()).lastIndexOf(target)};                                               
    }
}