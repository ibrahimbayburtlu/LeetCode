class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        
        arr = []
        for i in range(0,len(nums)):
            arr.insert(i,sum(nums[0:i+1]))
        return arr