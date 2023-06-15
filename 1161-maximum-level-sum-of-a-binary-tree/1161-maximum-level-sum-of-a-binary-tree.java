class Solution {

    public int maxLevelSum(TreeNode root) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        helper(root, 1, map);
        
        int res = -1;
       
        int max = Integer.MIN_VALUE; 

        for(int i = 1; i < map.size()+1; i++){
            if(map.get(i) > max){
                max = map.get(i);
                res = i;
            }
        }
        return res;
    }
    
    public void helper(TreeNode root, int d, Map<Integer, Integer> map){
        if(root == null) return;

        if(!map.containsKey(d)) map.put(d, root.val);
        
        else map.put(d, map.get(d) + root.val); 
        
        d++;

        helper(root.left, d, map); helper(root.right, d, map);
            
    }
}