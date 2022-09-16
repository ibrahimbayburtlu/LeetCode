class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length;i++){
            boolean flag = true;
            for (int j = 0; j < arr.length;j++){
                if (arr[i].equals(arr[j]) && i != j){
                    flag = false;
                }
            }
            if (flag){
                list.add(arr[i]);
            }
        }
        return list.size() >= k ? list.get(k-1) : "";  
    }
}