class Solution:
    def decode(self, encoded: List[int], first: int) -> List[int]:
        res = [first]
        for e in encoded:
            res.append(res[-1]^e)
        return res