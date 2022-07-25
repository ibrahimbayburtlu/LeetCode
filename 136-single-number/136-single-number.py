class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        for element in nums:
            if nums.count(element) == 1:
                return element