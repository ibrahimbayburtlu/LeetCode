class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        result = list(map(sum,accounts))
        return max(result)