class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        total = 0
        for element in nums:
            if nums.count(element) == 1:
                total += element
        return total