class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> res = new ArrayList<Integer>();
        List<Integer> rangeN= IntStream.range(1,nums.length+1).boxed().collect(Collectors.toList());

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++) map.put(nums[i],i);

        for(int i = 0; i < rangeN.size(); i++)
            if(!map.containsKey(rangeN.get(i))) res.add(rangeN.get(i));

        return res;
    }
}