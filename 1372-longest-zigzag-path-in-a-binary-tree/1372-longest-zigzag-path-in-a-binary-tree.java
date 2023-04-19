/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    int res = 0;
    public int longestZigZag(TreeNode root) {
        if(root == null) return 0;
        traverse(root.left, 1, true);        
        traverse(root.right, 1, false);
        return res;       
    }
    
    
    public void traverse(TreeNode root, int depth, boolean left)
    {
        if(root == null) return; 
        res = Math.max(res, depth);
        if(left){
            traverse(root.right, depth + 1, false);
            traverse(root.left, 1, true);
        }
        else{
            traverse(root.left, depth + 1, true);
            traverse(root.right,  1, false);
        }
    } 
}