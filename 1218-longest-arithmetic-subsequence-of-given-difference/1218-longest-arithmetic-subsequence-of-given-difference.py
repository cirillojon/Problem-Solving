class Solution:
    def longestSubsequence(self, arr: List[int], difference: int) -> int:
        res = 1
        map = {}
        for i in range(len(arr)):
            temp = arr[i] - difference
            if temp in map:
                map[arr[i]] = map[temp] + 1
            else:
                map[arr[i]] = 1
            res = max(res, map[arr[i]])
        return res