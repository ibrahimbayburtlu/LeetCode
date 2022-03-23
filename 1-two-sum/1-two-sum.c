

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target, int* returnSize){

    *returnSize = 2; /* Because We return 2 number*/
    
    int *arr = (int*)malloc(2*sizeof(int)); /* Because The problem want to malloc */
    
    for(int i = 0; i< numsSize-1;i++){
        for(int j=i+1; j< numsSize; j++){
            if(nums[i] + nums[j] == target){
                arr[0] = i;
                arr[1] = j;
                break;
            }
        }
    }
    return arr;
}