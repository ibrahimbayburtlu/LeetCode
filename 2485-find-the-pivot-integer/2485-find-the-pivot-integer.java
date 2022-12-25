class Solution {
    public int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2;
        for (int i = 1; i <= n; i++) {
            int sum = i * (i + 1) / 2;            
            if (sum == totalSum - sum + i) {
                return i;
            }
        }
        return -1;
    }
}