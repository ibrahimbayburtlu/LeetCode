class Solution:
    def cellsInRange(self, s: str) -> List[str]:
        rowstart = s[0]
        rowlast = s[3]
        colstart = int(s[1])
        collast = int(s[4])
        arr = []
        for element in range(ord(rowlast)-ord(rowstart)+1): # 0 1 2 3 4 5  => Row Number
            for i in range(colstart,collast+1): # 
                text = chr (ord (rowstart) + element)
                arr.append(text + str(i))
        return arr