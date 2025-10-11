class Solution {
    public int pairSum(ListNode head) {
        List<Integer> nodeValue = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            nodeValue.add(temp.val);
            temp = temp.next;
        }

        int start = 0;
        int last = nodeValue.size() - 1;
        int maxTwinValue = 0;

        while (start < last) {
            int twinSum = nodeValue.get(start) + nodeValue.get(last);
            maxTwinValue = Math.max(maxTwinValue, twinSum);
            start++;
            last--;
        }
        return maxTwinValue;
    }
}
