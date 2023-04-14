class Solution {
    public char findTheDifference(String s, String t) {
        int totalS = 0; int totalT = 0;

        for(int i = 0; i < t.length(); i++){   
            if(i < s.length())
            totalS = totalS + (int)(s.charAt(i));
            totalT = totalT + (int)(t.charAt(i));
        }
    
        return (char)(totalT-totalS);
        
    }
}