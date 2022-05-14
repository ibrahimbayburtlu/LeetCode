

int countKDifference(int* nums, int numsSize, int k){

    int total = 0;
    
    for (int i = 0; i < numsSize-1; i++){
        
        for(int j = i; j < numsSize; j++){
            if((nums[i] - nums[j] == k) || (nums[i] - nums[j] == -k))
                total ++;
        }
    }
    return total;
}