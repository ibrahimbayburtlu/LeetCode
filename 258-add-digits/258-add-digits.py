class Solution:
    def addDigits(self, num: int) -> int:
        flag = True
        while flag:
            num = str(num)
            total = 0 
            for i in range(len(num)):
                total += int(num[i])

            num = total
            if total < 10:
                flag = False
            else:
                flag = True
        return total