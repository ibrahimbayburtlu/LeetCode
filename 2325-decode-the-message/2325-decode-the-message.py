class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        hasht = {' ':' '}
        seq = 97
        for element in key:
            if element not in hasht and element != ' ':
                hasht[element] = chr(seq)
                seq += 1
        return "".join(hasht[m] for m in message)
