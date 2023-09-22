class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        res = len(s)
        count = 0
        for c in t:
            if count >= res:
                return True
            if s[count] == c:
                count += 1     
        return res == count