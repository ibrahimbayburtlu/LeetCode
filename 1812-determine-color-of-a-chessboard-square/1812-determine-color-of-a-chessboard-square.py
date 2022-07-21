class Solution:
    def squareIsWhite(self, coordinates: str) -> bool:
        row = coordinates[0]
        col = int(coordinates[1])
        if (row in ['a','c','e','g'] and col % 2 == 1) or (row in ['b','d','f','h'] and col % 2 == 0):
            return False
        return True