class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> rad = new LinkedList<>(), dir = new LinkedList<>();
        int n = senate.length();
        for (int i = 0; i < n; i++){
            if (senate.charAt(i) == 'R'){
                rad.add(i);
            } else {
                dir.add(i);
            }
        }
        while (!rad.isEmpty() && !dir.isEmpty()){
            if (rad.peek() < dir.peek()){
                rad.add(n++);
            } else {
                dir.add(n++);
            }
            rad.poll();
            dir.poll();
        }
        return (rad.isEmpty()) ? ("Dire") : ("Radiant");
    }
}