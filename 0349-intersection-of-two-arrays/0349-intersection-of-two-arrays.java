class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Map<Integer, Integer> one = new HashMap<>();
        Map<Integer, Integer> two = new HashMap<>();
        for(int i = 0 ; i < Math.max(nums1.length, nums2.length); i++){
            if(i < nums1.length) one.put(nums1[i], -1); 
            if(i < nums2.length) two.put(nums2[i], -1); 
            if(i < nums2.length && one.containsKey(nums2[i])) 
                set.add(nums2[i]);
            if(i < nums1.length && two.containsKey(nums1[i])) 
                set.add(nums1[i]);
        } int[] arr = new int[set.size()]; int i = 0;
        for(int n : set) arr[i++] = n; return arr; 
    }
}