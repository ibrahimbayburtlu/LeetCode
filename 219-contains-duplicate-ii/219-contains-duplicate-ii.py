class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        d = {} # set 
        i = 0
        for num in nums:
            if num in d:
                if abs(i-d[num]) <= k:
                    return True
                d[num] = i
            else:
                d[num] = i
            i = i + 1
        return False