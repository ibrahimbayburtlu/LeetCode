/**
 * @param {number[]} nums
 * @return {number}
 */
var arraySign = function(nums) {
    let negative = 0
    for (let i = 0; i < nums.length; i++){
        if (nums[i] < 0){
            negative += 1
        }
        if (nums[i] == 0){
            return 0
        }
    }
    if (negative % 2 == 0){
        return 1
    }else if(negative % 2 ==1){
        return -1
    } 
};