/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        ListNode temp = head;
        List<Integer> nodeValue = new ArrayList<Integer>();
        int maxTwinValue = 0;

        while(temp != null){
            nodeValue.add(temp.val);
            temp = temp.next;
        }
        int start = 0;
        int last = nodeValue.size() - 1;
        while(start < last){
            maxTwinValue = Math.max(nodeValue.get(start) + nodeValue.get(last),maxTwinValue);
            start++;
            last--;
        }
        return Math.max(maxTwinValue,nodeValue.get(nodeValue.size() / 2 - 1));

    }
}