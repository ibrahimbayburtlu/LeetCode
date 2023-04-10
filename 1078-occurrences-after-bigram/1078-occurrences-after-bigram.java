class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> arr = new ArrayList<>();
        for (int i = 0; i < words.length - 2;i++){
            if (Objects.equals(words[i], first) && Objects.equals(words[i + 1], second)){
                arr.add(words[i + 2]);
            }
        }
        String[] strings = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++){
            strings[i] = arr.get(i);
        }
        return strings;
    }
}