class Solution:
    def minMaxGame(self, nums: List[int]) -> int:
        while 1 < len(nums):
                newnums = []
                for i in range(len(nums)//2):
                        if i % 2 == 1:
                                newnums.append(max(nums[2*i],nums[2*i+1]))
                        else:
                                newnums.append(min(nums[2*i],nums[2*i+1]))
                nums = newnums
        return nums[0]