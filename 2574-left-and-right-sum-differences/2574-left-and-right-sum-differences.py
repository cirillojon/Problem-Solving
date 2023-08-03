class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        left = []
        right = []

        count = 0
        for n in nums:
            left.append(count)
            count += n

        count = 0
        for n in reversed(nums):
            right.append(count)
            count += n
        right.reverse()

        return [abs(left[i] - right[i]) for i in range(len(nums))]

