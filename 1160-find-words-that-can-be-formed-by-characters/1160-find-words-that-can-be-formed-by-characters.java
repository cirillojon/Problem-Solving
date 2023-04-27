class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < chars.length(); i++){
            if(map.containsKey(chars.charAt(i)))
                map.put(chars.charAt(i), map.get(chars.charAt(i)) + 1);
            else 
                map.put(chars.charAt(i), 1);
        }
        int res = 0; 
        for(int i = 0; i < words.length; i++){
            Map<Character, Integer> temp = new HashMap<Character, Integer>(map);
            for(int j = 0; j < words[i].length(); j++){
                if(temp.containsKey(words[i].charAt(j)) && temp.get(words[i].charAt(j)) > 0){
                    temp.put(words[i].charAt(j), temp.get(words[i].charAt(j)) - 1);
                } else break; if(j == words[i].length() - 1) res += j + 1;
            } 
        }
        return res;
    }
}