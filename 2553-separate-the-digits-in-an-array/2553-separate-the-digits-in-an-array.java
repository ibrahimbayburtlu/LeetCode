class Solution {
    public static int[] separateDigits(int[] nums) {
        ArrayList<String> list = new ArrayList<>();
        for (int num : nums) {
            String number = String.valueOf(num);
            for (int j = 0; j < number.length(); j++) {
                list.add(String.valueOf(number.charAt(j)));
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(list.get(i));
        }
        return arr;
    }
}