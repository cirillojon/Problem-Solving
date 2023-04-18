class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(!st.isEmpty()){
                if(st.peek() == s.charAt(i)){
                    st.pop();
                    continue;
                }st.add(s.charAt(i));
            }else st.add(s.charAt(i));    
        }return st.stream().map(x -> x.toString()).collect(Collectors.joining(""));        
    }
}