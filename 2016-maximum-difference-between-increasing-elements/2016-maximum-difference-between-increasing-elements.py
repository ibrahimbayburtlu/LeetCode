class Solution:
    def maximumDifference(self, nums: List[int]) -> int:
        arr = []
        for i in range(1,len(nums)):
            for j in range(0,i):
                if nums[i] > nums[j]:
                    arr.append(nums[i]-nums[j])

        if len(arr) > 0:
            n = max(arr)
            return n
        return -1