class Solution {
    public int minBitFlips(int start, int goal) {
        int x=start^goal;
        return Integer.bitCount(x);    
    }
}