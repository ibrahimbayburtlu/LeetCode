class Solution {
    public int nthUglyNumber(int n) {
        long[] factors = {2, 3, 5};
        Set<Long> seen = new HashSet<>();
        PriorityQueue<Long> heap = new PriorityQueue<>();
        
        seen.add(1L);
        heap.add(1L);
        
        long ugly = 1;
        
        for (int i = 0; i < n; i++) {
            ugly = heap.poll();
            for (long f : factors) {
                long next = ugly * f;
                if (seen.add(next)) {
                    heap.add(next);
                }
            }
        }
        return (int) ugly;
    }
}