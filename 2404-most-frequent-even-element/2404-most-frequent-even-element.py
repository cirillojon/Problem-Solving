class Solution:
    def mostFrequentEven(self, nums: List[int]) -> int:
        nums = sorted(nums)
        map = {n : 0 for n in nums}

        for n in nums:
            if n % 2 == 0:
                map[n] += 1

        max_count = 0
        for val in map.values():
            if val > max_count:
                max_count = val

        for key, val in map.items():
            if val == max_count and val != 0:
                return key

        return -1