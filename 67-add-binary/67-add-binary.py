class Solution:
    def addBinary(self, a: str, b: str) -> str:
        binarya = int(a, 2)
        binaryb = int(b,2)
        value = binarya + binaryb
        binaryvalue = format(value,'b')
        return binaryvalue