class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        arr = heights.copy()
        heights.sort()
        count = 0
        for i in range(len(arr)):
            if arr[i] != heights[i]:
                count += 1
        return count