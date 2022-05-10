

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* createTargetArray(int* nums, int numsSize, int* index, int indexSize, int* returnSize){

    *returnSize = numsSize;
    
    int *arr = (int*)malloc(sizeof(int)*numsSize);
    
    for (int i = 0; i < indexSize; i++){
         if(index[i] < indexSize - 1){
             for ( int  j = indexSize -1 ; j > index[i] ; j--){
                 arr[j] = arr[j-1];
             }
         }
        arr[index[i]] = nums[i];
    }
    return arr;
}