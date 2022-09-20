class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;

        // Go through each char column
        for (int j = 0; j < strs[0].length(); j++) {
            // Go through each string
            for (int i = 0; i < strs.length - 1; i++) {
                // If column's char is decreasing on the next string,
                // count as deletion index
                if (strs[i].charAt(j) > strs[i + 1].charAt(j)) {
                    count++;
                    break;
                }
            }
        }
        return count;   
    }
}