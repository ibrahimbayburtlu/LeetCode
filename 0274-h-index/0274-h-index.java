class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        for (int i = 0; i < citations.length / 2; i++) {
            int temp = citations[i];
            citations[i] = citations[citations.length - 1 - i];
            citations[citations.length - 1 - i] = temp;
        }
        int n = citations.length;
        int hIndex = citations[0];
        for (int i = 0; i < n; i++) {
            if (citations[i] >= i + 1) {
                hIndex = i + 1;
            }
        }
        return hIndex;
    }
}