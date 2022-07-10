class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        
        total = 0
        for i in operations:
            if i == '++X' or i == 'X++':
                total = total + 1
            if i == '--X' or i == 'X--':
                total = total - 1 
        return total 