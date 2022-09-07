class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length;i++){
            int maxNumber = 0;
            int control = 0;
            for (int j = i+1; j< arr.length;j++){
                if (arr[j] > maxNumber){
                    maxNumber = arr[j];
                    control = 1;
                }
            }
            arr[i] = control != 0 ? maxNumber : -1;
        }
        return arr;
    }
}