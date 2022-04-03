/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* runningSum(int* nums, int numsSize, int* returnSize){

    // int* nums => array
    // int numsSize => length
    // int* returnSize => return value
    
    int* arr = (int*)malloc(numsSize*sizeof(int));
    
    for (int j = 0; j < numsSize ;j++){
        arr[j] = 0;
        for (int i = 0;i < j+1;i++){
            arr[j] +=nums[i];
        }
    }
    *returnSize = numsSize; 

    return arr;
}