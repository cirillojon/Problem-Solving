class Solution {
    public int strStr(String haystack, String needle) {
        
        if(haystack.indexOf(needle) >= 0)
        return haystack.indexOf(needle);
        
        return -1;
    }
}