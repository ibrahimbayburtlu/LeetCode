class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        arr1  = ""
        arr2  = ""
        for i in word1:
            arr1 += i
        for i in word2:
            arr2 += i
        if arr1 == arr2:
            return True
        return False