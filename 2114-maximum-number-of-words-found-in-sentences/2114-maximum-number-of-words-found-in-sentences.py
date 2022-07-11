class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        
        arr = []
        for i in range(len(sentences)):
            # x = sentences[i].split()
            y = len(sentences[i].split())
            arr.append(y)
        return max(arr)