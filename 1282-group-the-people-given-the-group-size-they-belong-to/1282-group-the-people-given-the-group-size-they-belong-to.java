import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> allGroups = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++){
            ArrayList<Integer> list = map.getOrDefault(groupSizes[i], new ArrayList<>());
            map.put(groupSizes[i], list);
            list.add(i);
            if (list.size() == groupSizes[i]){
                allGroups.add(new ArrayList<>(list));
                map.put(groupSizes[i], new ArrayList<>());
            }
        }
        return allGroups;
    }
}