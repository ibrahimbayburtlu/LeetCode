class Solution:
    def smallestRangeI(self, nums: List[int], k: int) -> int:
        sorts = sorted(nums)

        if sorts[0] + abs(k) > sorts[-1] - abs(k):
            return 0
        else:
            return abs(sorts[-1] - abs(k)) - abs(sorts[0] + abs(k))
