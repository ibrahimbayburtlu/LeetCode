class Solution:
    def checkValid(self, matrix: List[List[int]]) -> bool:
        n = len(matrix)
        for i in range(n):
            row = []
            col = []
            for j in range(n):
                if matrix[i][j]>0 and matrix[i][j]<=n and matrix[i][j] not in row:  
                    row.append(matrix[i][j])
                if matrix[j][i]>0 and matrix[j][i]<=n and matrix[j][i] not in col:
                    col.append(matrix[j][i])

            if len(row)!=n or len(col)!=n:
                return False
        return True