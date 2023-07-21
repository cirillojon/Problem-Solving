class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        cache = {0:1}
        val = nums[0]
        res = 1
        for i in range(len(nums)):
            if nums[i] > val:
                res += 1
                cache[i] = res
                val = nums[i]
            else:
                temp_val = 0
                sub_list = list(nums[:i])
                for n in range(i-1, -1, -1):
                    if nums[i] > nums[n] and n in cache:
                        if cache[n] > temp_val:
                             temp_val = cache[n]
                cache[i] = temp_val + 1
                if cache[i] > res:
                    res = cache[i]
        return res