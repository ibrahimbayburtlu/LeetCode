class Solution:
    def countGoodRectangles(self, rectangles: List[List[int]]) -> int:
        arr = []
        for i in range(len(rectangles)): 
            arr.append(min(rectangles[i]))
        return arr.count(max(arr))