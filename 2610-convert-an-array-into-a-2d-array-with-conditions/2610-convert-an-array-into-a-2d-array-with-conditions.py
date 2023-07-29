class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        res = []
        test = set()


        index = 0
        for n in nums:
            for s in res:
                if n not in s:
                    s.add(n)
                    break
            else:
                res.append(set())
                res[-1].add(n)
        
        
        return res