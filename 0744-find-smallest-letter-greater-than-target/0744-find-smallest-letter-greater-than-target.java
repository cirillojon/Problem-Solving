class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(int i = 0; i < letters.length; i++)
            if((int)letters[i] > target) return letters[i];
        return letters[0];
    }
}