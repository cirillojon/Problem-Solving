class Solution:
    def sum_digits(self, n):
        s = str(n)
        res = 0

        for st in s:
            res += int(st) ** 2

        return res

    def isHappy(self, n: int) -> bool:
        res = n
        count = 0
        while res != 1 and count < 7:
            res = self.sum_digits(res)
            count += 1

        if res == 1:
            return True
        
        return False