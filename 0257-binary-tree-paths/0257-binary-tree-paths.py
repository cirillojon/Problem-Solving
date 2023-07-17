class Solution:
    def helper(self, res, root, curr):
        if(root is None):
            return
                
        curr.append(root.val)

        if(root.left is None and root.right is None):
            res.append(list(curr))
            return
        
        self.helper(res, root.left, list(curr))
        self.helper(res, root.right, list(curr))
        curr.pop()

    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        res = []
        self.helper(res, root, [])
        temp = []

        for arr in res:
            st = ""
            for i in range(len(arr)):
                st += str(arr[i])
                if i != len(arr)-1:
                    st += "->"
            temp.append(st)

        return temp