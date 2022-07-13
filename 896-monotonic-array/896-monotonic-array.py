class Solution:
    def isMonotonic(self, nums: List[int]) -> bool:
        increase = True
        decrease = True
        for i in range(len(nums)-1):
            
            if nums[i] > nums[i+1]:
                increase = False
                
            if nums[i] < nums[i+1]:
                decrease = False
                
        return increase or decrease