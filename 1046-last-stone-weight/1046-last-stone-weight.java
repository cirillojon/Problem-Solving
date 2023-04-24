class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        q.addAll(Arrays.stream(stones).boxed().collect(Collectors.toList()));
        while(q.size() > 1) q.add(q.poll()-q.poll()); return q.poll();
    }
}