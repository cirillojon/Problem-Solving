class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        PriorityQueue<Integer> list = new PriorityQueue<Integer>();
        
        for(int i = 0; i < nums1.length; i++) list.add(nums1[i]);
        for(int i = 0; i < nums2.length; i++) list.add(nums2[i]);
        double res = 0.0; double median = 0.0; 
        median = list.size()/2;

        if(list.size() % 2 != 0)
        {
            while(list.size() != median+1) list.poll();
            res =  list.poll();
        }

        else
        {
            while(list.size() != median + 1) list.poll();
            res = (list.poll() + list.poll()) / 2.0;
        }

        return res;
    }
}