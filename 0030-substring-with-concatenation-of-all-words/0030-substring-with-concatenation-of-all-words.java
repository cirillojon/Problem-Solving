class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<>();
        Map<String, Integer> cache = new HashMap<>();
        
        // Create map filled with words and their count
        for(int i = 0; i < words.length; i++) 
            cache.merge(words[i], 1, Integer::sum);

        // Length of 'Substring with Concatenation of All Words'
        int len = words[0].length()*words.length;
       
        for(int i = 0; i <= s.length() - len; i++)
            // Compare map for given substring with master cache
            if(is_valid(s.substring(i, len + i), words, cache))
                // If equal, add index to res
                res.add(i); return res;
    }
    public boolean is_valid(String s, String[] words, Map<String, Integer> cache){
         Map<String, Integer> map = new HashMap<>();
         int len = words[0].length(); int limit = s.length() - len;
         for(int i = 0; i <= limit; i += len)
            map.merge(s.substring(i, len + i), 1, Integer::sum);
       return map.equals(cache);
    }
}
