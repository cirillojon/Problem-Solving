class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        res = []
        for n in nums:
            for s in res:
                if n not in s:
                    s.add(n)
                    break
            else:
                res.append(set([n]))    
        return res