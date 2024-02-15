import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    public static List<List<Integer>> findMatrix(int[] nums) {

        List<List<Integer>> outerList = new ArrayList<>();
        HashMap<Integer,Integer> hashtable = new HashMap<>();

        
        for (int num : nums) {
            hashtable.put(num, hashtable.getOrDefault(num, 0) + 1);
        }
        System.out.println(hashtable);

        
        while (!hashtable.isEmpty()){
            List<Integer> arr = new ArrayList<>();
            List<Integer> keysToRemove = new ArrayList<>();

            
            for (int key : hashtable.keySet()) {
                arr.add(key);
                int count = hashtable.get(key);
                
                if (count > 1) {
                    hashtable.put(key, count - 1);
                } else {
                    
                    keysToRemove.add(key);
                }
            }

            
            for (int key : keysToRemove) {
                hashtable.remove(key);
            }
            outerList.add(arr);
        }

        return outerList;
    }
}
