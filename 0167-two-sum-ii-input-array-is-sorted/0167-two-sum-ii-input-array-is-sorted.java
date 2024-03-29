class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for(int i = 0; i < numbers.length; i++){
            if(map.containsKey(target-numbers[i])){
                res[1] = i+1; res[0] = map.get(target-numbers[i])+1;
                return res;
            }
            map.put(numbers[i],i);
        }
        return res;
    }
}