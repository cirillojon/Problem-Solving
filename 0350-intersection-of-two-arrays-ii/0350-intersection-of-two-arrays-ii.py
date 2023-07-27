class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:

        one = {n : nums1.count(n) for n in nums1}
        two = {n : nums2.count(n) for n in nums2}
        res = []

        for n in nums1:
            if n in one and n in two:
                temp = [n] * min(one[n], two[n])
                res += temp
                del(one[n])
                del(two[n])
              
        return res