class Solution:
    def helper(self, res, left, right, s):
            if left == 0 and right == 0:
                res.append(s)
            
            if left > 0:
                self.helper(res, left - 1, right + 1, s + "(")
                
            if right > 0:
                self.helper(res, left, right - 1, s + ")")
                
    def generateParenthesis(self, n: int) -> List[str]:
        s = ""
        res = []
        self.helper(res, n, 0, s)
        return res