class Solution:
    def diStringMatch(self, s: str) -> List[int]:
        n = len(s)
        start = 0
        arr = []
        for i in s:
            if i == 'D':
                arr.append(n) 
                n -= 1
            else:
                arr.append(start)
                start += 1
        arr += [start]
        return arr