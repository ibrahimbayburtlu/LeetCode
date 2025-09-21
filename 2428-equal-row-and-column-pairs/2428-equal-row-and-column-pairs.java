import java.util.*;

class Solution {
    public int equalPairs(int[][] grid) {
        List<List<Integer>> gridListRow = new ArrayList<>();
        List<List<Integer>> gridListColumn = new ArrayList<>();
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            List<Integer> listRow = new ArrayList<>();
            List<Integer> listColumn = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                listRow.add(grid[i][j]);
                listColumn.add(grid[j][i]);
            }
            gridListRow.add(listRow);
            gridListColumn.add(listColumn);
        }

        int count = 0;
        for (int i = 0; i < gridListRow.size(); i++) {
            for (int j = 0; j < gridListColumn.size(); j++) {
                if (gridListRow.get(i).equals(gridListColumn.get(j))) {
                    count++;
                }
            }
        }
        return count;
    }
}
