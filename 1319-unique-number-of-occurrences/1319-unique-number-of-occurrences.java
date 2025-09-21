import java.util.*;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        return set.size() == map.values().size();
    }
}

/*
HashTable<K,V> table = new HashTable<>();
getOrDefaultValue
1 -> 3
2 -> 2
3 -> 1

*/