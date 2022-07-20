class Solution:
    def shortestToChar(self, s: str, c: str) -> List[int]:
        arr = []
        for i in range(len(s)):
            if s[i] == c:
                arr.append(i)

        newarr = []
        for i in range(len(s)):
            minnum = len(s)
            for j in range(len(arr)):
                if abs(i-arr[j]) < minnum:
                    minnum = abs(i-arr[j])
            newarr.append(minnum)
        return newarr    