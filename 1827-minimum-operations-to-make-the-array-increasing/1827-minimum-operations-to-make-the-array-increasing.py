class Solution:
    def minOperations(self, nums: List[int]) -> int:
        total = 0
        for i in range(len(nums)-1): # 0 1 2 3 
            if nums[i] >= nums[i+1]:
                total += nums[i] - nums[i+1] + 1
                nums[i+1] = nums[i] + 1
        return total