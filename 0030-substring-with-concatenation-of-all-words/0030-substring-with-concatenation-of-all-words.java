class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<Integer>();
        Map<String, Integer> cache = new HashMap<String, Integer>();
        
        // Create map filled with words and their count
        for(int i = 0; i < words.length; i++){
            if(!cache.containsKey(words[i])) cache.put(words[i], 1); 
			else cache.put(words[i], cache.get(words[i])+1); 
        }

        // Length of 'Substring with Concatenation of All Words'
        int len = words[0].length()*words.length;
       
        for(int i = 0; i < s.length() - len+1; i++)
                // Compare map for given substring with master cache
                if(is_valid(s.substring(i, len + i), words, cache))
                    // If equal, add index to res
                    res.add(i); 
        return res;
    }
    public boolean is_valid(String s, String[] words, Map<String, Integer> cache){
        Map<String, Integer> map = new HashMap<String, Integer>();
         for(int i = 0; i <= s.length() - words[0].length(); i += words[0].length()){
            String temp = s.substring(i, words[0].length() + i);
            if(!map.containsKey(temp)) map.put(temp, 1); 
            else map.put(temp, map.get(temp)+1);   
        }
        return map.equals(cache);
    }
}