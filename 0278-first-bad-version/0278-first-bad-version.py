# The isBadVersion API is already defined for you.
# def isBadVersion(version: int) -> bool:

class Solution:
    def firstBadVersion(self, n: int) -> int:
        left = 0
        right = n
        res = n + 1
        while(left <= right):
            mid = (left+right) // 2
            
            if isBadVersion(mid):
                right = mid - 1
                if mid < res:
                    res = mid
            else:
                left = mid + 1
                
        return res