class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        
        int count = piles.length / 3;
        int n = piles.length - 1;
        int i = 0;
        // 11 9 7 5.elemanlar
        // 14 12 10 8 6 elemanlar
        int total = 0;
        while(count > 0){
            total += piles[n - 1 - i];
            i+= 2;
            count--;
        }
        return total;
    }
}