class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        cache = {0:1}
        val = nums[0]
        count = 1
        for i in range(len(nums)):
            if nums[i] > val:
                count += 1
                cache[i] = count
                val = nums[i]
            else:
                x = 0
                temp = list(nums[:i])
                for n in range(len(temp), -1, -1):
                    if nums[i] > nums[n]:
                        if n in cache:
                            if cache[n] > x:
                                x = cache[n]
                cache[i] = x + 1
                if cache[i] > count:
                    count = cache[i]
        return count
            
