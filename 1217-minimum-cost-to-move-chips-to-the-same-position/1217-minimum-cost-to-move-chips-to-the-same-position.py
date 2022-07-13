class Solution:
    def minCostToMoveChips(self, position: List[int]) -> int:
        length_evens = len([x for x in position if x % 2 == 0])
        length_odds = len(position) - length_evens
        
        return min(length_evens, length_odds)