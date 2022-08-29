class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxVealth = 0;
        for (int i = 0; i <accounts.length;i++){
            int total = 0;
            for (int j = 0; j < accounts[i].length;j++){
                total += accounts[i][j];
            }
            if (total > maxVealth){
                maxVealth = total;
            }
        }
        return maxVealth; 
    }
}