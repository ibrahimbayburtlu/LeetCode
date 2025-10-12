import java.util.*;

class SmallestInfiniteSet {
    private PriorityQueue<Integer> pq;
    private Set<Integer> set;
    private int next;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        set = new HashSet<>();
        next = 1;
    }

    public int popSmallest() {
        if (!pq.isEmpty()) {
            int smallest = pq.poll();
            set.remove(smallest);
            return smallest;
        }

        return next++;
    }

    public void addBack(int num) {
        if (num < next && !set.contains(num)) {
            pq.add(num);
            set.add(num);
        }
    }
}

/**
 * Kullanım:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int val1 = obj.popSmallest(); // 1
 * int val2 = obj.popSmallest(); // 2
 * obj.addBack(1);              // 1 tekrar eklendi
 * int val3 = obj.popSmallest(); // 1
 * int val4 = obj.popSmallest(); // 3
 */
