class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        
        arr = []
        j = 0
        for i in range(0,2*n,2):
            arr.insert(i,nums[j])
            arr.insert(i+1,nums[n+j])
            j = j + 1
        return arr