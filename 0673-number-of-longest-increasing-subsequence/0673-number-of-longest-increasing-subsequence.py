class Solution:
    def findNumberOfLIS(self, nums: List[int]) -> int:
        cache = {}   # cache[i] = length of longest ending in nums[i]
        counts = {}  # counts[i] = number of longest ending in nums[i]

        for i in range(len(nums)-1, -1, -1): 
            cache[i] = 1
            counts[i] = 1
            for n in range(i+1, len(nums)):
                if nums[n] > nums[i]:
                    if cache[i] < cache[n] + 1:
                        cache[i] = cache[n] + 1
                        counts[i] = counts[n]  
                        # If we find a longer subsequence ending at i,
                        # update the length and set the count to counts[n]
                    elif cache[i] == cache[n] + 1:
                        counts[i] += counts[n]  
                        # If we find an equal-length subsequence, increment the count

        max_length = max(cache.values())
        return sum(counts[i] for i, length in cache.items() if length == max_length)

