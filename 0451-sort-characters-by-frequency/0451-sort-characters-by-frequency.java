import java.util.Collection;
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
                continue;
            } map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        StringBuilder res = new StringBuilder();
        List<Map.Entry<Character, Integer>> temp;
        temp = map.entrySet().stream().collect(Collectors.toList());
        Collections.sort(temp, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        for(int i = 0; i < temp.size(); i++)
            for(int j = 0; j < temp.get(i).getValue(); j++)
                res.append(temp.get(i).getKey()); 
        return res.toString();
    }
}