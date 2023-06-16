class Solution {
    public List<Integer> findSubstring(String s, String[] w) {
      List<Integer> r = new ArrayList<>(); Map<String, Integer> m = new HashMap<>();
      for(int i = 0; i < w.length; i++) m.merge(w[i], 1, Integer::sum); 
      int len = w[0].length()*w.length; for(int i = 0; i <= s.length() - len; i++) 
      if(is_valid_word_map(s.substring(i, len + i), w[0].length(), m)) r.add(i); return r; } 
    public boolean is_valid_word_map(String s, int l, Map<String, Integer> m) {
      Map<String, Integer> t = new HashMap<>(); for(int i = 0; i <= s.length() - l; i += l) 
      t.merge(s.substring(i, l + i), 1, Integer::sum); return t.equals(m); } 
}
