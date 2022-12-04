class Solution {
    public String replaceDigits(String s) 
    {
        char[] word = s.toCharArray();

        Map<String, Integer> map = new HashMap<String, Integer>() {
        {
            int count = 1;
            for (char ch = 'a'; ch <= 'z'; ++ch) 
            {
                 put(String.valueOf(ch),count); 
                 count++;
            }
               
        }};

        for(int i = 0; i < s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
               char temp = word[i-1];
               int num = Integer.valueOf(String.valueOf(s.charAt(i)),10);
               temp += num; 
               word[i] = temp;
            }
        } 
        return String.valueOf(word);
    }
}