

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* shuffle(int* nums, int numsSize, int n, int* returnSize){

    *returnSize = numsSize;
    
    // nums is array 
    // numsSize is length
    
    int* arr = (int*)malloc(sizeof(int)*numsSize);   
    int i,j = 0;
    
    for (i = 0; i <n; i++){
        arr[j++] = nums[i];
        arr[j++] = nums[i+n];
    }
    return arr;
}