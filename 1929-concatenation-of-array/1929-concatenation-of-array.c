

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getConcatenation(int* nums, int numsSize, int* returnSize){
   
    
    int numsSize2 = numsSize * 2;
    
    int* arr =(int*)malloc((numsSize2)*sizeof(int)); 
    
    for (int i = 0;i < numsSize ; i++){
        arr[i] = nums[i];
        arr[i+numsSize] = nums[i];
    }
    *returnSize = numsSize2;
    
    return arr;
}