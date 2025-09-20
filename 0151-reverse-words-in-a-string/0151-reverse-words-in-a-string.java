class Solution {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        String[] wordsArr = s.trim().split("\\s+"); // birden fazla boşluk için
        StringBuilder result = new StringBuilder();
        for (int i = wordsArr.length - 1; i >= 0; i--) {
            result.append(wordsArr[i]);
            if (i > 0) result.append(" ");
        }

        return result.toString();
    }
}
