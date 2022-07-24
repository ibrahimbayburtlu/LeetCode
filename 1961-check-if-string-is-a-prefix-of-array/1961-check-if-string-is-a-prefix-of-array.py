class Solution:
    def isPrefixString(self, s: str, words: List[str]) -> bool:
        text = ""
        for i in range(len(words)):
            text += words[i]
            if text == s:
                return True
        return False