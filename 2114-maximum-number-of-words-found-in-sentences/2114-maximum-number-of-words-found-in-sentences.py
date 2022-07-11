class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        
        y = []
        for i in range(len(sentences)):
            y.insert(i,len(sentences[i].split()))

        return max(y)
            
            