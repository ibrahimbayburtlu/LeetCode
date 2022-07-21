class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        arr = []
        for element in range(left,right+1):
            if '0' not in str(element): 
                elementstr = str(element)
                length = len(str(element))
                count = 0
                for i in range(0,length):
                    if element % int(elementstr[i]) == 0:
                        count += 1
                if count == length:
                    arr.append(element)
        return arr