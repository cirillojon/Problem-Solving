class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []

        def helper(nums, k, temp, res):
            if len(nums) == k:
                res.append(list(temp))
                return

            helper(nums, k + 1, list(temp), res)
            temp.append(nums[k])
            helper(nums, k + 1, list(temp), res)

        helper(nums, 0, [], res)
        return res