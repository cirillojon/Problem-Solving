class Solution {

    public int maxLevelSum(TreeNode root) {

        // Map to store level sums
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // Call helper function to calculate sums
        helper(root, 1, map);
        
        // Result set to -1 by default
        int res = -1;
       
        // Max set to min value by default
        int max = Integer.MIN_VALUE; 

        // Find max sum using depth as key (one indexed)
        for(int i = 1; i < map.size()+1; i++){
            if(map.get(i) > max){
                max = map.get(i);
                res = i;
            }
        }
        // Return max level sum
        return res;
    }
    
    public void helper(TreeNode root, int d, Map<Integer, Integer> map){
        if(root == null) return;

        // Add depth to map 
        if(!map.containsKey(d)) map.put(d, root.val);
        
        // Update level sum
        else map.put(d, map.get(d) + root.val); 
        
        // Iterate depth
        d++;

        // Traverse tree
        helper(root.left, d, map); helper(root.right, d, map);
            
    }
}