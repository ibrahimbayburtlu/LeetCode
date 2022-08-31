class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int j = 0;
        int count = 0;
        j = ruleKey.equals("color") ? 1 : ruleKey.equals("name") ? 2 : 0;
        for (int i = 0;i <items.size();i++){
            if (items.get(i).get(j).equals(ruleValue)){
                count += 1;
            }
        }
        return count;
    }
}