class Solution:
    def countOdds(self, low: int, high: int) -> int:
        if low%2==1 and high%2==1:
            return (high-low)//2 + 1
        # both even
        elif low%2==0 and high%2==0:
            return (high-low)//2
        # one odd, one even
        else:
            return (high-low+1)//2