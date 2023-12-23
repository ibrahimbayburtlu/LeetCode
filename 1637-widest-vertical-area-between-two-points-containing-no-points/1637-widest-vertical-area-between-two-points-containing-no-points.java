class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points,(a,b) -> Double.compare(a[0],b[0]));
        System.out.println(Arrays.deepToString(points));

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < points.length - 1; i++) {
            max = Math.max(max, points[i + 1][0] - points[i][0]);
        }
        return max;  
    }
}