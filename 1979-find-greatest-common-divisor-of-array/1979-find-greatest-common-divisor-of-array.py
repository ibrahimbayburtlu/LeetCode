class Solution:
    def findGCD(self, nums: List[int]) -> int:
        
        maxNumber = max(nums)
        minNumber = min(nums)
        
        for j in range(minNumber,0,-1):
            if maxNumber % j == 0 and minNumber % j == 0:
                return j