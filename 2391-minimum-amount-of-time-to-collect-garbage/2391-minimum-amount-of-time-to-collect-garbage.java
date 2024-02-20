class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        
        int glassIndex = -1;
        int paperIndex = -1;
        int metalIndex = -1;

        int glassCount = 0;
        int paperCount = 0;
        int metalCount = 0;

        for (int i = garbage.length - 1; i >= 0; i--){
            for (int j = garbage[i].length() - 1; j >= 0; j--){
                if (garbage[i].charAt(j) == 'G'){
                    glassIndex = Math.max(i, glassIndex);
                    glassCount++;
                }
                if (garbage[i].charAt(j) == 'P'){
                    paperIndex = Math.max(i, paperIndex);
                    paperCount++;
                }
                if (garbage[i].charAt(j) == 'M'){
                    metalIndex = Math.max(i, metalIndex);
                    metalCount++;
                }
            }
        }

        int total = 0;
        int glassTotal = 0;
        int paperTotal = 0;
        int metalTotal = 0;

        for (int i = 0; i < travel.length && i < glassIndex; i++){
            glassTotal += travel[i];
        }
        for (int i = 0; i < travel.length && i < paperIndex; i++){
            paperTotal += travel[i];
        }
        for (int i = 0; i < travel.length && i < metalIndex; i++){
            metalTotal += travel[i];
        }

        glassTotal += glassCount;
        paperTotal += paperCount;
        metalTotal += metalCount;

        total = glassTotal + paperTotal + metalTotal;

        return total;
    }
}