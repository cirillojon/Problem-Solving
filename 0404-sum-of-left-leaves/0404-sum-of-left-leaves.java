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
    public int sumOfLeftLeaves(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        traverseTree(list, root); int res = 0;
        System.out.println(list);
        for(int i = 0; i < list.size(); i++) res += list.get(i);
        return res;
    }
    public ArrayList traverseTree(ArrayList list, TreeNode root)
    {
        if(root.left != null) {
            if(root.left.left == null && root.left.right == null)
            list.add(root.left.val); traverseTree(list, root.left);
        }
         if(root.right != null) traverseTree(list, root.right);
         return list;
    }
}