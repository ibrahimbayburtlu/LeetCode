class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        
        arr = []
        for i in range(0,len(nums)):
            arr.insert(i,nums[nums[i]]) 
        return arr