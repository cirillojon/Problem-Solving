class SmallestInfiniteSet {
    HashSet<Integer> set = new HashSet<Integer>();
    PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    public SmallestInfiniteSet() { for(int i = 1; i <= 1000; i++){ set.add(i); pq.add(i); } }
    public void addBack(int num) { if(set.add(num)) pq.add(num); }
    public int popSmallest() { int res = -1; if(!pq.isEmpty()) res = pq.peek(); set.remove(pq.poll()); return res; }
} 