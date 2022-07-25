class Solution:
    def countSegments(self, s: str) -> int:
        s.strip()
        arr = s.split()
        return len(arr)