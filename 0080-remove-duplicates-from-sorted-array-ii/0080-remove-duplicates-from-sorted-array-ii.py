class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        for i, num in enumerate(nums):
            while i < len(nums)-2 and num == nums[i+2]:
                del(nums[i+2])