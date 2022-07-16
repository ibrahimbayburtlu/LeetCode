class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        maxnum = 0
        for i in range(len(nums)): # 0 1 2 3 
            for j in range(len(nums)): # 0 1 2 3
                if i != j and maxnum <= (nums[i]-1) * (nums[j]-1):
                    maxnum = (nums[i]-1) * (nums[j]-1)
        return maxnum