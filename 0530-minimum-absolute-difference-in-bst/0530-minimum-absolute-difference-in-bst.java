class Solution {
    int min = Integer.MAX_VALUE; int temp = -1;
    public int getMinimumDifference(TreeNode root) {
        if(root == null) return min;  
        getMinimumDifference(root.left); 
        if(Math.abs(temp - root.val) < min && temp != -1)
            min = Math.abs(temp-root.val); temp = root.val;
        getMinimumDifference(root.right);
        return min;
    }
} 