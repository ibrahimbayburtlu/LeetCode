class Solution:
    def repeatedNTimes(self, nums: List[int]) -> int:
        for element in nums:
            if nums.count(element) == len(nums) // 2:
                return element