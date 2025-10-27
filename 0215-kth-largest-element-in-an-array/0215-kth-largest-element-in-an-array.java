import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int num = 0;
        for(int value: nums){
            queue.offer(value);
        }

        while(k > 0){
            num = queue.poll();
            k--;
        }
        return num;
    }
}
