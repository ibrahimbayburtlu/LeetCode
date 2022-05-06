

int subtractProductAndSum(int n){

    int i = 0;
    int multi = 1;
    int sum = 0;
    int arr[5];
    
    while(n > 0){
        
        arr[i] = n % 10;
        n = n / 10;
        multi = multi * arr[i];
        sum = sum + arr[i];
        i++;
    }
    return multi - sum ;
}