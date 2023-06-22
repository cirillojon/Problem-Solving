class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> one = new HashMap<>();
        Map<String, Integer> two = new HashMap<>();
        int res = 0;
        for(int i = 0; i < words1.length; i++){
            if(!one.containsKey(words1[i]))
                one.put(words1[i], 1);
            else
                one.put(words1[i], one.get(words1[i]) + 1);
        } for(int i = 0; i < words2.length; i++){
            if(!two.containsKey(words2[i]))
                two.put(words2[i], 1);
            else
                two.put(words2[i], two.get(words2[i]) + 1);
        } for(int i = 0; i < words1.length; i++){
            if(one.containsKey(words1[i]) &&
               two.containsKey(words1[i]) &&
               one.get(words1[i]) == 1 &&
               two.get(words1[i]) == 1)
               res++;
        } return res;
    }
}