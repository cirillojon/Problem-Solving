class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        Map<Integer, Integer> safe = new HashMap<>();
        Set<Integer> res = new HashSet<>();

        // Add terminal nodes to safe
        for(int i = 0; i < graph.length; i++)
            if(graph[i].length == 0) {res.add(i); safe.put(i,0);}

        boolean flag = false; int temp = 0;

        // Goes until no new nodes are added to safe
        while(temp != safe.size()){
            temp = safe.size();
            for(int i = 0; i < graph.length; i++){
                for(int j = 0; j < graph[i].length; j++)
                    // If adjacent node is either an existing safe/terminal node, add to safe
                    if(safe.containsKey(graph[i][j])) 
                        flag = true;
                    else{
                        flag = false; break;}
                // Flag used to ensure all adjacent nodes were safe
                if(flag) {safe.put(i, 0); res.add(i);}
                flag = false;
            }
        }
        List<Integer> list = new ArrayList<>(res);
        Collections.sort(list);
        return list;
    }
}