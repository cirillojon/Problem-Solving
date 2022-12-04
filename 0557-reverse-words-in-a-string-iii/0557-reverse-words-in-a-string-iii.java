class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder(); int lastSpace = 0;
        for(int i = 0; i < s.length(); i++)
            if(Character.isWhitespace(s.charAt(i)) || i == s.length()-1){
                StringBuilder str = new StringBuilder(); 
                if(!(i == s.length()-1)) str = new StringBuilder(s.substring(lastSpace,i));
                else str = new StringBuilder(s.substring(lastSpace,i+1));
                str = str.reverse(); res.append(str.toString());
                if(!(i == s.length()-1)) res.append(" ");
                lastSpace = i+1;
                continue;
            }
        return res.toString();
    }
}