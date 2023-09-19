class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
        for n in nums:
            index = abs(n)
            if nums[index] < 0:
                return index
            nums[index] = -1 * nums[index]
            
        return 0