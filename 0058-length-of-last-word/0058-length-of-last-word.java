class Solution {
    public int lengthOfLastWord(String s) {
        
        //Set index to index of last char
        int i = s.length()-1;

        //Find  the end of the last word in s
        while(s.charAt(i) ==  ' ') i--;
        
        //Set value to last char index
        int temp = i;

        //Find start of word
        while(s.charAt(i) !=  ' ')
        {
            
            i--;

            //If word starts at beginning of string, return value of lat char + 1 once the first char index is found
            if(i < 0 ) return temp+1;
        }

        //Return last char - first char
        return temp - i;
    }
}