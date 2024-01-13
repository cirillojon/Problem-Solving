class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        r_with_device = [int(row) > 0 for row in bank]
        res = 0
        last_device_i = 0
        for i, row in enumerate(r_with_device):
            if row and i != 0:
                res += (bank[i].count("1") * bank[last_device_i].count("1"))
                last_device_i = i
        return res