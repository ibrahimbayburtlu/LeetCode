class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
            
        int start,end,mid;
        int count = 0;

        // sorting the second array
        Arrays.sort(arr2);

        for (int elem1 : arr1) {
            start = 0;
            end = arr2.length - 1;
            count++;
            while (start <= end) {
                mid = start + (end - start) / 2;
                if (Math.abs(arr2[mid] - elem1) <= d) {
                    count--;
                    break;
                }
                if (arr2[mid] > elem1)
                    end = mid - 1;
                else start = mid + 1;
            }
        }
        return count;    
    }
}