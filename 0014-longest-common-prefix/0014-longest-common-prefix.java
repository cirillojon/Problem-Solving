class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder(); char ch; int index = 0; 
        int min = Integer.MAX_VALUE; int mindex = 0;
        for(int i = 0; i < strs.length; i++)
            if(strs[i].length() < min){
                    min = strs[i].length();
                    mindex = i;
                }
        for(int i = 0; i < min; i++){
            ch = strs[mindex].charAt(index);
            for(int j = 0; j < strs.length; j++)
                if(ch != strs[j].charAt(index)) return res.toString();
            res.append(ch);
            index++;
        }
        return res.toString();
    }
}   