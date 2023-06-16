My first real hard :)

## Step 1 : Create 'master' word map
``for(int i = 0; i < w.length; i++) m.merge(w[i], 1, Integer::sum);``
This map will contain the correct counts for given words[i] in the concatenated string containing each word. This will be important later when checking if potential substrings of s are composed correctly.

For example, for the second test case, the 'master' map will return as:
```{best=1, good=1, word=2}```. If there is a substring that looks valid because it is of correct length and contains valid words, it could trick our algorithm if we did not check for the amount of words in the given substring

## Step 2 : Check potential substrings
Firstly, we use this loop: ```for(int i = 0; i <= s.length() - len; i++) ```
This loop ends at ```s.length() - len``` because for example, if the length of the concatenated substring is 8, if there are only 7 chars left in s, we know we will not be able to create a valid concatenated substring.
Secondly, we then use ```s.substring(i, len + i)``` to grab potential substrings. 
Earlier we delcared ``len`` here:  ```int len = w[0].length()*w.length;```
```len``` is equal to the length of any valid concatenated substring.
So we can use this in our loop to check all substrings in s of valid length. 
## Step 3 : Pass to helper function to compare with 'master'
 The ```boolean is_valid_word_map()``` function recieves a substring of valid length, the given word length, and the master map. Then a map is created for this given substring in the same manner that the master map was created. If this substring is valid, it's map should be equal to the master map and ```t.equals(m);``` will return as true.

## Step 4 : Add valid substrings to result and rturn
If ```is_valid_word_map()``` returns true for a given substring in s, we can append its starting index to our List. Once the loop ends, we can simply return this list.
``` 
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
```

