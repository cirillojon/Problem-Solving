class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost); int res = 0;
        Stack<Integer> st = new Stack<Integer>();
        for(int i = 0; i < cost.length; i++) st.push(cost[i]);
        while(st.size() > 2){
            res += st.pop() + st.pop(); st.pop();
        }
        while(!st.isEmpty()) res += st.pop();
        return res;
    }
}