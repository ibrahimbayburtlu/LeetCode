class Solution:
    def getNoZeroIntegers(self, n: int) -> List[int]:
        for i in range(n):
            arr = []
            A = i 
            B = n - i
            if A != 0 and B != 0 and '0' not in str(B) and '0' not in str(A):
                arr.append(int(A))
                arr.append(int(B))
                return arr