class Solution {
    public int largestAltitude(int[] gain) {

        int gainLen = gain.length;
        int[] gainNPlusOne = new int[gainLen + 1];
        gainNPlusOne[0] = 0;
        int maxGain = 0;
        for(int i = 1;i < gainNPlusOne.length;i++){
            gainNPlusOne[i] = gain[i - 1] + gainNPlusOne[i - 1];
            maxGain = Math.max(maxGain,gainNPlusOne[i]);
        }
        return maxGain;
        
    }
}
/*
0.index -> 0
1.index -> 0 + -5 = -5
2.index -> -5 + 1 = -4
3.index -> -4 + 5 = 1
4.index -> 1 + 0 = 1
5.index -> -7 + 1 = -6

*/