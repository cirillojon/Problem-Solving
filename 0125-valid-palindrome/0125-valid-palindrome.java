class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase(); 
        s = s.toLowerCase(); s = s.replaceAll("[^a-zA-Z0-9]", "");
        for(int i = 0; i < s.length() / 2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
        } return true;
    }
}