class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i = 0; i < nums.length; i++) pq.add(nums[i]);
        while(pq.size() > k) pq.poll(); return pq.poll(); }
}