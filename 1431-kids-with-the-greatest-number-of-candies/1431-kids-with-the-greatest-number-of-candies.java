class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> list = new ArrayList<>(Arrays.stream(candies).boxed().collect(Collectors.toList()));
        Collections.sort(list); List<Boolean> res = new ArrayList<Boolean>();
        for(int i = 0; i < candies.length; i++)
            res.add((candies[i] + extraCandies) >= list.get(list.size()-1));
        return res;  
    }
}