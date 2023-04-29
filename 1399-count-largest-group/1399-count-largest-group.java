class Solution {
    private int findSum(int n){
        int res =0;
        while(n>0){
            res+=n%10;
            n=n/10;

        }
        return res;
    }
    public int countLargestGroup(int n) {
        int freq[] = new int[37];
        int res=0;
        int maxCount =0;
        for(int i=1;i<=n;i++){
            int sum = findSum(i);
            freq[sum]++;
            if(maxCount<freq[sum]){

                res=1;
                maxCount= freq[sum];
            }
            else if(freq[sum]==maxCount){
                res++;
            }

        }
        return res;
        
    }
}