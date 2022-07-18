class Solution:
    def countPrefixes(self, words: List[str], s: str) -> int:
        count = 0
        for element in words:
            if element in s[0:len(element)]:
                count += 1
        return count    