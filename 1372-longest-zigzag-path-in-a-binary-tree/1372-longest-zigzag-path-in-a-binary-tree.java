class Solution{
    int res = 0;
    public int longestZigZag(TreeNode root) {
        if(root == null) return res;
        traverseTree(root.left, 1, true); traverseTree(root.right, 1, false);
        return res;
    } public void traverseTree(TreeNode root, int d, boolean left){
        if(root == null){ res = Math.max(d - 1, res); return; }
        if(left) { traverseTree(root.right, d + 1, false); traverseTree(root.left, 1, true); }
        if(!left) { traverseTree(root.left, d + 1, true); traverseTree(root.right, 1, false); }
    }
}