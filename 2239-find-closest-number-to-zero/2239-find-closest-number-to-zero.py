class Solution:
    def findClosestNumber(self, nums: List[int]) -> int:
        minnumber = abs(nums[0])
        for i in range(len(nums)):
            if abs(nums[i]) < minnumber:
                minnumber = abs(nums[i])

        if minnumber in nums:
            return minnumber
        return -1 * minnumber