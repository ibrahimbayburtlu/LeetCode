class Solution {
    public int arrangeCoins(int n) {
            int i;
        for(i=1; i<=n; i++){
            n -= i;
        }
        return i-1;   
    }
}