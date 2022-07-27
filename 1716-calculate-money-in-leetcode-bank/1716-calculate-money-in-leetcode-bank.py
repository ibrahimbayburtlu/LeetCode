class Solution:
    def totalMoney(self, n: int) -> int:
        total = 0
        k = 0
        for i in range(n):
            if i % 7 == 0:
                k += 1
            total += k + (i%7)
        return total