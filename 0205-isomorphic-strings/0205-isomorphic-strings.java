class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        int[] res1 = new int[s.length()];
        int[] res2 = new int[t.length()];

        HashMap<Character, Integer> map1 = new HashMap<Character,Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character,Integer>();

        for(int i = 0; i < s.length(); i++)
        {
           if(!map1.containsKey(s.charAt(i)))
           map1.put(s.charAt(i),i);

           if(!map2.containsKey(t.charAt(i)))
           map2.put(t.charAt(i),i);

           res1[i] = map1.get(s.charAt(i));
           res2[i] = map2.get(t.charAt(i));

           System.out.println(res1[i]);
        }
    
    return Arrays.equals(res1,res2);
    }
}