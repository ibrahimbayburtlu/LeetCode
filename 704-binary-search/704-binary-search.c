

int search(int* nums, int numsSize, int target){
    
    // nums is array 
    // numsSize is length
    // target is wanted
    
    int right = numsSize-1;
    int left = 0;
    
    while(left <= right){
        
        int mid = (right + left) / 2;   
        
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] < target){
            left = mid+1;
        }
        else if(nums[mid] > target){
            right = mid-1;
        }
    }
    return -1;
}