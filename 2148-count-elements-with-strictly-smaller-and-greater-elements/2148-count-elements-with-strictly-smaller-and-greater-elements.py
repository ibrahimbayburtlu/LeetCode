class Solution:
    def countElements(self, nums: List[int]) -> int:
        nums.sort()
        maxnumber = nums[-1]
        minnumber = nums[0]
        total = 0
        for i in range(1,len(nums)-1):
            if nums[i] < maxnumber and nums[i] > minnumber:
                total += 1
        return total