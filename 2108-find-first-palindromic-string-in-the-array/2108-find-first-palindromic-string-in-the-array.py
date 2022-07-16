class Solution:
    def firstPalindrome(self, words: List[str]) -> str:
        arr = ""
        for element in words:
            n = len(element) // 2
            count = 0
            for character in range(n):
                if element[character] == element[-character-1]:
                    count += 1
            if count == n:
                return element
        return arr 