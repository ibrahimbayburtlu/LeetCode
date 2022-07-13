class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max_profit = 0
        best_price_to_buy = prices[0]
        for price in prices:
            if price < best_price_to_buy:
                best_price_to_buy = price
            elif price > best_price_to_buy:
                profit = price - best_price_to_buy
                if profit > max_profit:
                    max_profit = profit
        return max_profit