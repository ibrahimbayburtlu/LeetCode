/**
 * @param {number} n - a positive integer
 * @return {number}
 */
const hammingWeight = (n) => n.toString(2).replaceAll("0", "").length;