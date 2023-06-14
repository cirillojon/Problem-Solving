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
    int min = Integer.MAX_VALUE;
    List<Integer> list = new ArrayList<Integer>();
    public int getMinimumDifference(TreeNode root) {
         helper(root); 
         for(int i = 0; i < list.size(); i++)
            for(int j = 0; j < list.size(); j++)
                if(i != j && Math.abs(list.get(i) - list.get(j)) < min)
                    min = Math.abs(list.get(i) - list.get(j));
         return min;
    }

    public void helper(TreeNode root){
        if(root == null) return; list.add(root.val);
        helper(root.left); helper(root.right);
    }
}