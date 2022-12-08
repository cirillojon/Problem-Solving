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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        ArrayList<Integer> leftVals =  new ArrayList<Integer>();
        ArrayList<Integer> rightVals =  new ArrayList<Integer>();

        treeVals(root1,leftVals); treeVals(root2,rightVals); 
        return leftVals.equals(rightVals);
    }
    ArrayList treeVals(TreeNode root,ArrayList vals){
        if(root == null) return vals;

        if(root.left == null && root.right == null)
        vals.add(root.val);

        if(root.left != null) treeVals(root.left, vals);
        if(root.right != null) treeVals(root.right, vals);
        
        return vals;
    }
}