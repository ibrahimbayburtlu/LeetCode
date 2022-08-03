/**
 * @param {number} low
 * @param {number} high
 * @return {number}
 */
var countOdds = function(low, high) {
    let total = 0
    for(let i = low; i <=high; i++){
        if(i % 2 == 1){
            total += 1
        }
    }
    return total
};