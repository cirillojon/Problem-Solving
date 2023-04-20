class Solution {
    public int maxPower(String s) {
        int res  = 0;
        for(int i = 0; i < s.length(); i++){
            res = Math.max(res, helper(s.substring(i)));
        }
        return res;
    }
    public int helper(String s){
        HashSet<Character> set = new HashSet<Character>();
        int i = 0;
        set.add(s.charAt(i));
        while (i < s.length() && !set.add(s.charAt(i)))
        i++;
        return i;
    }
}