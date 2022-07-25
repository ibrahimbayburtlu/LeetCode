class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        s.strip()
        arr = s.split()
        return len(arr[-1])