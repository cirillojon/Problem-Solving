class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> res = new ArrayList<Integer>();
        Map<String, Integer> cache = new HashMap<String, Integer>();
        StringBuilder concat = new StringBuilder();

        // Create map filled with words and their count
        // Create one StringBuilder of all words concatenated
        for(int i = 0; i < words.length; i++){
            if(!cache.containsKey(words[i])){
                cache.put(words[i], 1); concat.append(words[i]);
            } 
            else{cache.put(words[i], cache.get(words[i])+1); concat.append(words[i]);}
        }

        // Calulcate sum using character integer values
        int string_sum = get_val(concat.toString());

        // Length of 'Substring with Concatenation of All Words'
        int len = words[0].length()*words.length;
       

        for(int i = 0; i < s.length() - len+1; i++)
            // Only check substrings = to string_sum
            if(get_val(s.substring(i, len + i)) == string_sum)
                // Compare map for given substring with master cache
                if(is_valid(s.substring(i, len + i), words, cache))
                    // If equal, add index to res
                    res.add(i); 
        return res;
    }

    /* Helper functions */

    public int get_val(String s){
        int sum = 0;
        for(int i = 0; i < s.length(); i++)
            sum += s.charAt(i); return sum;
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