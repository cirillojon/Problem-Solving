import java.util.Collection;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
                continue;
            } 
            map.put(nums[i],map.get(nums[i])+1);
        }
        Collection<Integer> values = map.values();
        ArrayList<Integer> listOfValues = new ArrayList<>(values);
        Set<Integer> keySet = map.keySet();
        ArrayList<Integer> listOfKeys= new ArrayList<Integer>(keySet);
        int[] res = new int[k]; List<Integer> arr;
        arr = keySet.stream().collect(Collectors.toList());
        int count = 0; int index = 0;
        while(count < k)
        {
            Integer var = listOfValues.stream().max(Integer::compare).get();
            int num = Integer.valueOf(var);

            res[count] = arr.get(listOfValues.indexOf(num));
            index = listOfValues.indexOf(num);
            listOfValues.set(index,-100);
            count++;
        }
        return res;
    }
}
