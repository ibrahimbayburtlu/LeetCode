class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        ans = []
        for i in range(0,len(nums)-1,2): # iterates from 0th to last 2nd element of nums taking 2 steps at a time
            ans += ([nums[i+1]] * nums[i]) # add [value] times freq to ans list
        return ans