class Solution:
    def countBits(self, n: int) -> List[int]:
        def convert(num, res):
            if num >= 1:
                convert(num // 2, res)
                res.append(num % 2) 
        
        ans = []
        for num in range(n + 1):
            res = []
            convert(num, res)
            ans.append(res.count(1))

        return ans