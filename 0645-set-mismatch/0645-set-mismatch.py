class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        count_map = {}
        correct_set = [n+1 for n in range(len(nums))]

        for n in correct_set:
            count_map[n] = 1

        for n in nums:
            count_map[n] += 1
        
        res = [0,0]

        for k, v in count_map.items():
            if v == 3:
                res[0] = k
            if v == 1:
                res[1] = k

        return res