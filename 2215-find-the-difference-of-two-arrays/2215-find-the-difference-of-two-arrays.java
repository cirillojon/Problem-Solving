class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        map.put(0, Arrays.stream(nums1).boxed().collect(Collectors.toList()));
        map.put(1, Arrays.stream(nums2).boxed().collect(Collectors.toList()));
        List<Integer> list1 = new ArrayList<Integer>(); 
        List<Integer> list2 = new ArrayList<Integer>(); 

        for(int i = 0; i < Math.max(nums1.length, nums2.length); i++){
            if(i < nums1.length)
            if(!map.get(1).contains(nums1[i]) && !list1.contains(nums1[i])) list1.add(nums1[i]);
            if(i < nums2.length)
            if(!map.get(0).contains(nums2[i]) && !list2.contains(nums2[i])) list2.add(nums2[i]);
        }

        res.add(list1); res.add(list2);
        
        return res;
    }
}