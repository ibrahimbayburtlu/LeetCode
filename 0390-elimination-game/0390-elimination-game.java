import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int lastRemaining(int n) {
        return lastRemainingRecursive(n, true);
    }

    public int lastRemainingRecursive(int n, boolean leftToRight) {
        if (n == 1) {
            return 1;
        }

        if (leftToRight) {
            return 2 * lastRemainingRecursive(n / 2, false);
        } else {
            if (n % 2 == 0) {
                return 2 * lastRemainingRecursive(n / 2, true) - 1;
            } else {
                return 2 * lastRemainingRecursive(n / 2, true);
            }
        }
    }
}
