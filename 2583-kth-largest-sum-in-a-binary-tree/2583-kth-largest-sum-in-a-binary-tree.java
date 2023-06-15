class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        Map<Integer, Long> map = new HashMap<Integer, Long>();
        List<Long> list = new ArrayList<Long>();
        helper(root, 1, map); int res = -1;
        if(k > map.size()) return -1;
        for(int i = 1; i < map.size()+1; i++) list.add(map.get(i));
        Collections.sort(list); return list.get(list.size()-k);
    }
    public void helper(TreeNode root, int d, Map<Integer, Long> map){
        if(root == null) return;
        if(!map.containsKey(d)) map.put(d, (long) root.val);
        else map.put(d, map.get(d) + root.val); d++;
        helper(root.left, d, map); helper(root.right, d, map);        
    }
}