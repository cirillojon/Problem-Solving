class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) 
            if(!map.containsKey(nums[i])){
                pq.add(nums[i]);
                map.put(nums[i], -1);
            }     
        if(pq.size() < 3){
            while(pq.size() > 1)
                pq.poll();
                return pq.poll();
        }
        while(pq.size() > 3) pq.poll(); return pq.poll(); 
    }
}