class Solution:
    def prefixCount(self, words: List[str], pref: str) -> int:
        count = 0
        for element in words:
            if pref == element[0:len(pref)]:
                count +=1
        return count