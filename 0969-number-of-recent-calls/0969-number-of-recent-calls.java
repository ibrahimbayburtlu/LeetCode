import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    Queue<Integer> recentQueue = new LinkedList<>();

    public RecentCounter() {}

    public int ping(int t) {

        recentQueue.offer(t);

        while (!recentQueue.isEmpty() && recentQueue.peek() < t - 3000) {
            recentQueue.poll();
        }


        return recentQueue.size();
    }
}
