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
         System.out.println(list);
         for(int i = 0; i < list.size()-1; i++)
                if(Math.abs(list.get(i) - list.get(i+1)) < min)
                    min = Math.abs(list.get(i) - list.get(i+1));
         return min;
    }

    public void helper(TreeNode root){
        if(root == null) return; 

        
        helper(root.left); 
        list.add(root.val);
        helper(root.right);

    }
}