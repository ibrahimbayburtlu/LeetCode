class Solution {
    public int numberOfBeams(String[] bank) {
        
        ArrayList<Integer> list = new ArrayList<>();


        for (String s : bank) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    count++;
                }
            }
            list.add(count);
        }

        // [3,0,2,1]
        int sum = 0;

        for (int i = 0; i < list.size() - 1;i++){
            boolean flag = true;
            for (int j = i + 1; j < list.size();j++){
                if (list.get(i) != 0 && list.get(j) != 0 && flag){
                    System.out.println(list.get(i) + " " + list.get(j));
                    sum += list.get(i) * list.get(j);
                    flag = false;
                }
            }
        }

        return sum;
        
    }
}