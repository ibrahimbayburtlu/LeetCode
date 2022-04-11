

/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* smallerNumbersThanCurrent(int* nums, int numsSize, int* returnSize){

    // nums is array
    // numsSize is array length
    // returnSize ;
    
    *returnSize = numsSize;
    
    int* arr = (int*)malloc(numsSize*sizeof(int));
    

    for (int i = 0; i < numsSize; i++){
        
        arr[i] = 0;
        
        for (int j = 0; j < numsSize;j++){
            
                if(nums[i] > nums[j]){
                
                    arr[i]++;
                }
            }
        }
        return arr;
    }