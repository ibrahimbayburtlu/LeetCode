class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        maxCandies = max(candies)
        result = []
        for i in range(len(candies)):
            if candies[i]+extraCandies >= maxCandies:
                result.append(True)
            else:
                result.append(False)
        return result