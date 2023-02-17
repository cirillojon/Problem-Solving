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

    public int minDiffInBST(TreeNode root) {
    ArrayList<Integer> list = new ArrayList<Integer>(); 
    int minDiff = Integer.MAX_VALUE; traverseTree(list,root);
    for(int i = 0; i < list.size()-1; i++)
        if(Math.abs(list.get(i+1) - list.get(i)) < minDiff) minDiff = Math.abs(list.get(i+1) - list.get(i));
    return minDiff; 
}
    public ArrayList<Integer> traverseTree(ArrayList list, TreeNode root){
        if(root.left != null) traverseTree(list, root.left);
        list.add(root.val); 
        if(root.right != null) traverseTree(list, root.right);
        return list;
    }
}