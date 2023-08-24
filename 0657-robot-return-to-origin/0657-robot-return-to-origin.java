class Solution {
    public boolean judgeCircle(String moves) {
        int countY = 0;
        int countX = 0;
        for (int i = 0; i < moves.length();i++){
            switch (moves.charAt(i)){
                case 'U': countY++;break;
                case 'D': countY--;break;
                case 'R': countX++;break;
                case 'L': countX--;break;
            }
        }
        return countY == 0 && countX == 0;    
    }
}