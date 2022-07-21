class Solution:
    def isSameAfterReversals(self, num: int) -> bool:
        reverse1 = int(str(num)[::-1])
        if num == int(str(reverse1)[::-1]):
            return True
        return False