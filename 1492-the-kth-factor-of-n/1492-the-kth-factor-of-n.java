class Solution {
    public int kthFactor(int n, int k) {
        // Create a list for factors
        List<Integer> list = new ArrayList();

        // add factorys in list
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                list.add(i);
            }
        }

        // check k in factory List
        return list.size() >= k ? list.get(k - 1) : -1;
    }
}