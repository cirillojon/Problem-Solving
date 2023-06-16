class Solution {

    public String minWindow(String s, String t) {
        int min = Integer.MAX_VALUE;
        String res = "";
        
        Map<Character, Integer> char_counts = new HashMap<>();
        for(int i = 0; i < t.length(); i++)  char_counts.merge(t.charAt(i), 1, Integer::sum);

        Map<Character, Integer> temp = new HashMap<>(char_counts);
        int count = temp.size(); 

        int start = 0; 
        for(int end = 0; end < s.length(); end++){
            char endChar = s.charAt(end);
            if(temp.containsKey(endChar)){
                temp.put(endChar, temp.get(endChar) - 1);
                if(temp.get(endChar) == 0) {
                    count--;
                }
            }
            
            while(count == 0){
                if(end - start + 1 < min){
                    min = end - start + 1;
                    res = s.substring(start, end + 1);
                }

                char startChar = s.charAt(start);
                if(char_counts.containsKey(startChar)){
                    temp.put(startChar, temp.get(startChar) + 1);
                    if(temp.get(startChar) > 0){
                        count++;
                    }
                }
                start++;
            }
        }
        return res;
    } 
}
