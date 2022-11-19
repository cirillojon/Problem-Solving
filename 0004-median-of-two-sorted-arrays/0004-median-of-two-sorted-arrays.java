class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
    
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < nums1.length; i++)
        {
            list.add(nums1[i]);
        }
         for(int i = 0; i < nums2.length; i++)
        {
            list.add(nums2[i]);
        }
    
        Collections.sort(list);
        
        double median = 0.0;
        int size = list.size();
        
        if(size%2 != 0)
            median = list.get(size/2); 
        
        else
            median = (list.get(size/2)+list.get((size/2)-1))/2.0;
        
        System.out.println("list: " +list);
        
        return median;
    }
}