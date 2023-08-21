class Solution:
    def repeatedSubstringPattern(self, s: str) -> bool:
        
        sum_val = sum(ord(st) for st in s)
        temp = 0
        
        for i, st in enumerate(s):
            if i == len(s) - 1:
                return False

            temp += ord(st)
            if sum_val % temp == 0:
                if ("".join([s[:i+1]] * (sum_val // temp))) == s:
                    return True

        return False