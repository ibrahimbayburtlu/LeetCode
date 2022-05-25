

int sumOddLengthSubarrays(int* arr, int arrSize){
    

    int size = 1;
    int sum = 0;
    
    while(size <=arrSize){
        for(int i = 0; i < arrSize;i++){
            for(int j = i; j < size+i && size+i <= arrSize;j++){
                sum += arr[j];
            }
        }
        size += 2;
    }
    return sum;
}