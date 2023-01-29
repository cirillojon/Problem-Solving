class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

            ArrayList<List<String>> list = new ArrayList<List<String>>();
            String[] sorts = new String[strs.length];

            for(int i = 0; i < strs.length; i++){
                char[] temp = strs[i].toCharArray();
                Arrays.sort(temp);
                sorts[i] = String.valueOf(temp);
            }

            HashSet<String> set = new HashSet<String>();
            for(int i = 0; i < strs.length; i++)
            {
                ArrayList<String> sortList = new ArrayList<String>();
                ArrayList<String> unsortList = new ArrayList<String>();
                if(set.add(sorts[i]))
                {
                    sortList.add(sorts[i]);

                    for(int j = 0; j < strs.length; j++)
                    {
                        if(sortList.contains(sorts[j])) 
                        {
                            unsortList.add(strs[j]);
                        }
                    } 
                    if(!list.contains(unsortList))
                    list.add(unsortList);      
                }
            }
        return list;
    }
}