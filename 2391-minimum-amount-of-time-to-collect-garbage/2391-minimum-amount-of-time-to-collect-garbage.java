class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        
        int n = garbage.length;
        int m = travel.length;

        int glassIndex = -1;
        int paperIndex = -1;
        int metalIndex = -1;

        int glassCount = 0;
        int paperCount = 0;
        int metalCount = 0;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = garbage[i].length() - 1; j >= 0; j--) {
                char c = garbage[i].charAt(j);
                if (c == 'G') {
                    glassIndex = Math.max(i, glassIndex);
                    glassCount++;
                } else if (c == 'P') {
                    paperIndex = Math.max(i, paperIndex);
                    paperCount++;
                } else if (c == 'M') {
                    metalIndex = Math.max(i, metalIndex);
                    metalCount++;
                }
            }
        }

        int total = 0;
        int glassTotal = 0;
        int paperTotal = 0;
        int metalTotal = 0;

        for (int i = 0; i < Math.min(m, glassIndex); i++) {
            glassTotal += travel[i];
        }
        for (int i = 0; i < Math.min(m, paperIndex); i++) {
            paperTotal += travel[i];
        }
        for (int i = 0; i < Math.min(m, metalIndex); i++) {
            metalTotal += travel[i];
        }

        total = glassTotal + glassCount + paperTotal + paperCount + metalTotal + metalCount;

        return total;
    }
}