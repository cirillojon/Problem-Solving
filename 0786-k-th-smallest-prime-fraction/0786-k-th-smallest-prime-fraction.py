class Solution:
    def kthSmallestPrimeFraction(self, arr: List[int], k: int) -> List[int]:
        fractions = [(i,j) for i in arr for j in arr]
        sorted_fractions = (
            sorted(fractions, key=lambda x: (x[0]/x[1]))
        )
        return [sorted_fractions[k-1][0], sorted_fractions[k-1][1]]

