class Solution:
    def isValid(self, s: str) -> bool:
        
        stack = []
        
        for st in s:
            if st == '(':
                stack.append(')')
            elif st == '[':
                stack.append(']')
            elif st == '{':
                stack.append('}')
                
            elif len(stack) == 0 or stack.pop() != st:
                return False
            
        return True if len(stack) == 0 else False