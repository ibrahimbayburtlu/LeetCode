

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* sortedSquares(int* nums, int numsSize, int* returnSize){

    
    // nums is array 
    
    // numsSize is length(array)
    
    // returnSize is 
    
    int* arr = (int*)malloc(numsSize*sizeof(int));
    int i = 0 , j = 0 , min_idx = 0;
    for (i = 0; i < numsSize; i++)
    {
        arr[i] = nums[i] * nums[i];
    }
    
    // Selection Sort
    
    for ( i = 0; i < numsSize-1; i++){
        for ( j = i+1; j < numsSize; j++){
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    *returnSize = numsSize ;
    
    return arr; 
}