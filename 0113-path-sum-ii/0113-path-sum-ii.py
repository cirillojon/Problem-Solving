# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def helper(self, res, root, targetSum, curr):
        if root is None:
            return False
        
        if targetSum - root.val == 0 and root.left is None and root.right is None:
            curr.append(root.val)
            res.append(list(curr))

        targetSum -= root.val
        curr.append(root.val)
        
        self.helper(res, root.left, targetSum, list(curr))  
        self.helper(res, root.right, targetSum, list(curr))
        
        curr.pop()
        
    def pathSum(self, root: Optional[TreeNode], targetSum: int) -> List[List[int]]:
        res = []
        self.helper(res, root, targetSum, [])
        return res