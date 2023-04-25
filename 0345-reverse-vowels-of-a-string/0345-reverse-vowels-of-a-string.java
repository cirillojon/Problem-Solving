class Solution {
    public String reverseVowels(String s) {
        Stack<Character> st = new Stack<Character>();
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < s.length(); i++) 
            if(is_vowel(String.valueOf(s.charAt(i)).toLowerCase())) st.push(s.charAt(i));
        for(int i = 0; i < s.length(); i++){
            if(is_vowel(String.valueOf(s.charAt(i)).toLowerCase())) res.append(st.pop());
            else res.append(s.charAt(i));
        } return res.toString();
    }
    public boolean is_vowel(String c){
        if(c.equals("a") || c.equals("e") || c.equals("i") || c.equals("o") || c.equals("u"))
            return true; return false;
    }
}