class Solution:
    def dominantIndex(self, nums: List[int]) -> int:
        arr = nums.copy()
        nums.sort()
        if nums[-1] >= nums[-2]*2:
            return arr.index(nums[-1])
        return -1