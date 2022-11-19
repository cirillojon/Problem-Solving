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
        
    public static ArrayList<Integer> list = new ArrayList<Integer>();
    
    

    public List<Integer> postorderTraversal(TreeNode root) {
        
      
        list.clear();

        
        inOrder(root);
     
        return list;
    }
    
    
    public TreeNode inOrder(TreeNode root)
    {
        
        if( root == null)
        return null;
        
      

        if(root.left != null)
        {
            
            inOrder(root.left);
        }
        if(root.right != null)
        {
            
            inOrder(root.right);
        }
        
     
      
        
        list.add(root.val);
        return root;

    }
}