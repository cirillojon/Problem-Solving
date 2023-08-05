class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
       
        for st in s:
            temp = str(s[1:])
            temp += s[0]
            s = temp
            if s == goal:
                return True
                
        return False