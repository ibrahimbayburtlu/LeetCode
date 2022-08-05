/**
 * @param {number} x
 * @param {number} y
 * @param {number[][]} points
 * @return {number}
 */
var nearestValidPoint = function(x, y, points) {
    let indexOfMin = -1;
    let minDistance = Infinity;
    for(let i = 0; i < points.length; i++){
        const [x1, y1] = points[i];
        if(x1 !== x && y1 !== y) continue;
        
        const distance = Math.abs(x1 - x) + Math.abs(y1 - y);
        if(distance < minDistance){
            minDistance = distance;
            indexOfMin = i;
        }
    }
	
    return indexOfMin;
};