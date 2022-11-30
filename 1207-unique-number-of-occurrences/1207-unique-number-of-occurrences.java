class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    ArrayList<Integer> nums = new ArrayList<Integer>();

    for(int i = 0; i < arr.length; i++)
    {
        if(!map.containsKey(arr[i]))
        {
            map.put(arr[i],1);
            nums.add(arr[i]);
        }
        
        else
        map.put(arr[i],map.get(arr[i])+1);

    }

    HashSet<Integer> set = new HashSet<Integer>();

    for(int i = 0; i < nums.size(); i++)
        if(!set.add(map.get(nums.get(i))))
            return false;
    
        return true;
    }
}