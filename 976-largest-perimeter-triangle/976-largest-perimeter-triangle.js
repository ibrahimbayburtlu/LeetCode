/**
 * @param {number[]} nums
 * @return {number}
 */
var largestPerimeter = function(nums) {
    nums.sort((a, b) => b - a);
    
    let [s1, s2, s3] = [nums[0], nums[1], nums[2]];
    
    for (let i = 3; i < nums.length; i++) {
        if (s1 < s2 + s3) return s1 + s2 + s3;
        [s1, s2, s3] = [s2, s3, nums[i]];
    }
    
    return s1 < s2 + s3 ? s1 + s2 + s3 : 0;
};