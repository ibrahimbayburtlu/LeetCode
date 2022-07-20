class Solution:
    def sortArrayByParity(self, nums: List[int]) -> List[int]:
        arr = []
        newarr = []
        for element in nums:
            if element % 2 == 1:
                arr.append(element)
            else:
                newarr.append(element)
        newarr.extend(arr)
        return newarr