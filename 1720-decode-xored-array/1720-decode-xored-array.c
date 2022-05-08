

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* decode(int* encoded, int encodedSize, int first, int* returnSize){
    
    
    int *arr = malloc((encodedSize+1)*sizeof(int));
    
    arr[0] = first;
    
    *returnSize = encodedSize + 1;
    
    for(int i = 1; i <= encodedSize; i++){
        arr[i] = arr[i-1]^encoded[i-1];
    }
    return arr;
}