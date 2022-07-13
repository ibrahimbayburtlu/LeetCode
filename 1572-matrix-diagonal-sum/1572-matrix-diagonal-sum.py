class Solution:
    def diagonalSum(self, mat: List[List[int]]) -> int:
        total = 0
        for i in range(len(mat)): # 0 1 2 3 
            for j in range(len(mat)): # 0 1 2 3 
                if i == j: # (0 0) (1 1) (2 2) (3 3) 
                    total += mat[i][j] 
            total += mat[i][len(mat)-i-1]
        if len(mat) % 2 == 1:
            total -= mat[len(mat)//2][len(mat)//2]
        return total