class Solution {
    public int reverse(int x) {
        Stack<Integer> s = new Stack<Integer>();
        boolean neg = false; String str = String.valueOf(x);
        if(str.length() == 1) return x; int res = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '-') { neg = true; continue;}
            s.push(Character.getNumericValue(str.charAt(i)));
        }   while(s.peek() == 0) s.pop();
        StringBuilder sb = new StringBuilder();
        if(neg == true) sb.append("-");
        while(!s.isEmpty()) sb.append(s.pop());
        try{ res = Integer.valueOf(sb.toString()); }
        catch(NumberFormatException e){ return 0; } return res;
    }
}