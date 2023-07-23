class Solution:
    def findLengthOfLCIS(self, nums: List[int]) -> int:
        curr = 1 
        res = 1
        for i in range(len(nums)-1):
            if nums[i+1] > nums[i]:
                curr += 1
            else:
                res = max(res, curr)
                curr = 1
        return max(res, curr)
                
        