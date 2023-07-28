class Solution:
    def lexicalOrder(self, n: int) -> List[int]:     
        return sorted([l for l in range(1,n+1)], key=str)