/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    let multiply = 1
    let total = 0
    let stringN = String(n)
    for(let i = 0; i < stringN.length; i++){
        multiply *= parseInt(stringN[i])
        total += parseInt(stringN[i])
    }
    return multiply - total
};