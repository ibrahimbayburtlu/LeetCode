

int minimumSum(int num){
    
    
    int arr[4] = {0,0,0,0};
    int minSum = 0;
    int temp = 0;
    
    
    // split numbers
    // Because numbers have four numbers
    for (int i = 0; i < 4; i++){
        
        arr[i] = num % 10;
        num=num/10;
    }
    
    // (Sorting) because we want to sort small to large numbers array's
    
    for (int i = 0; i < 4; i++){
        
        for (int j = i; j < 4; j++){
         
             if (arr[j] < arr[i]){
                 
                temp =  arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    return ((arr[0]*10 + arr[2]) + (arr[1]*10 + arr[3]));
}