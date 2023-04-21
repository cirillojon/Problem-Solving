class Solution {
    public boolean isSameAfterReversals(int num) {
        Stack<Integer> st = new Stack<Integer>();
        String s = String.valueOf(num); if(s.length() == 1) return true;
        for(int i = 0; i < s.length(); i++) st.push(Character.getNumericValue(s.charAt(i)));
        while(st.peek() == 0) st.pop(); StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) sb.append(st.pop()); return num == (Integer.valueOf(sb.reverse().toString()));
    }
}