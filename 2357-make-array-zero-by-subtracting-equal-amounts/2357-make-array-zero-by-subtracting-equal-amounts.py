class Solution:
    def minimumOperations(self, nums: List[int]) -> int:
        nums.sort()
        res = 0
        
        while sum(nums) != 0:
            temp = [n for n in nums if n > 0]
            val = temp.pop(0)
            for i in range(len(nums)):
                if nums[i] > 0:
                    nums[i] -= val   
            res += 1
            
        return res