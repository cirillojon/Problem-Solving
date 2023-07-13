class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        StringBuilder word = new StringBuilder();
        StringBuilder res = new StringBuilder();
        Set<String> set = new HashSet<>();
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            if(index+1 > pattern.length()) return false;
            if(s.charAt(i) == ' ' || i+1 == s.length()){
                if(i+1 == s.length()) word.append(s.charAt(i));  
                if(map.containsKey(pattern.charAt(index))){
                    if(map.get(pattern.charAt(index)).equals(String.valueOf(word))){
                       res.append(pattern.charAt(index)); word.setLength(0); index++; continue;
                   } else return false;
                } map.put(pattern.charAt(index), String.valueOf(word)); 
                if(!set.add(String.valueOf(word))) return false;
                res.append(pattern.charAt(index)); index++; word.setLength(0); continue;
            } word.append(s.charAt(i));  
        } return String.valueOf(res).equals(pattern);
    }
}