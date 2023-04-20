class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int i = 0; i < s.length(); i++)
            max = Math.max(max, helper(s.substring(i)));
            return max;
    }
    
    public int helper(String s){
        HashSet<Character> set = new HashSet<Character>();
        int i = 0;
        while(i < s.length() && set.add(s.charAt(i))) i++;
        return i;
    }
}