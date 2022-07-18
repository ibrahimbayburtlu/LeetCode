class Solution:
    def kthDistinct(self, arr: List[str], k: int) -> str:
        temp=[]
        for i in arr:
            c=arr.count(i)
            if c==1:
                if i not in temp:
                    temp.append(i)
        return (temp[k-1]) if len(temp)>=k else ""