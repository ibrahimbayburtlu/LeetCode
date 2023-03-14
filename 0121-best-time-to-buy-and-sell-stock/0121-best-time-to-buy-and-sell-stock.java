class Solution {
    public int maxProfit(int[] prices) {
        int calculateTotal = 0;
        int bestPriceToBuy = prices[0];
        for(int i = 1; i < prices.length;i++){
            if (prices[i] < bestPriceToBuy){
                bestPriceToBuy = prices[i];
            }else{
                int profit = prices[i] - bestPriceToBuy;
                if (profit > calculateTotal){
                    calculateTotal = profit;
                }
            }
        }
        return calculateTotal;
    }
}