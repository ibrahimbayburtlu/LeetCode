

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* decompressRLElist(int* nums, int numsSize, int* returnSize){

    int *arr =malloc(sizeof(int)*(numsSize/2)*100);
    *returnSize = 0;
    for(int i = 0; i < numsSize;i+=2){
        for (int j = 0; j < nums[i];j++){
            arr[*returnSize] = nums[i+1];
            (*returnSize)++;
        }
    }
    return arr;
}
    