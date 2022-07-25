class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        text = ""
        for element in num:
            text += str(element)

        text = str(int(text) + k)

        arr = []
        for element in text:
            arr.append(element)

        return arr