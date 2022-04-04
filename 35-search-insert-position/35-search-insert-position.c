

int searchInsert(int* nums, int numsSize, int target){

    // nums is array
    // numsSize is length
    // target is wanted
    
    int i;

    for (i = 0; i < numsSize ; i++){
        
        if(nums[i] >= target){   
            return i;
        }
    }
    return i;
}