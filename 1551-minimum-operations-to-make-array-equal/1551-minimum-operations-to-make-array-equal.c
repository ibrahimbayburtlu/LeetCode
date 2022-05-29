

int minOperations(int n){
    int res = 0;
    int temp=1;
    for(int i=1;i<n;i++){
        res +=temp;
        if(i%2==0) ++temp;
    }
    return res;
}