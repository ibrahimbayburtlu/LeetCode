class Solution:
    def countGoodTriplets(self, arr: List[int], a: int, b: int, c: int) -> int:
        count = 0
        n = len(arr)
        for i in range(0,n-2):
            for j in range(i+1,n-1):
                for k in range(j+1,n):
                    x = abs(arr[i] - arr[j])
                    y = abs(arr[j] - arr[k]) 
                    z = abs(arr[i] - arr[k])       
                    if x <= a and y <= b and z <= c:
                        count += 1
        return count