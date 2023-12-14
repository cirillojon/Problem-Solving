class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        max = 0
        for i, _ in enumerate(nums):
            for j, _ in enumerate(nums):
                if i != j and (nums[i]-1) * (nums[j]-1) > max:
                    max = (nums[i]-1) * (nums[j]-1) 

        return max