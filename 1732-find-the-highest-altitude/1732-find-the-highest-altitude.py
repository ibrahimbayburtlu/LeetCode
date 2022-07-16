class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        arr = [0]
        total = 0
        for i in range(len(gain)):
            total += gain[i]
            arr.append(total)
        return max(arr)