class Solution:
    def countSubarrays(self, nums: List[int]) -> int:
        res = 0
        for start in range(len(nums)):
            end = start + 2
            if end == len(nums):
                return res
            if (nums[end] + nums[start]) == (nums[end - 1] / 2):
                res += 1
