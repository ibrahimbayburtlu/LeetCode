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
    public ListNode mergeNodes(ListNode head) {
        ListNode node = head.next;
        ListNode nn = new ListNode();
        head = nn;

        int sum = 0;
        while(node != null) {
            if(node.val == 0) {
                nn.next = new ListNode(sum);
                nn = nn.next;
                sum = 0;
            } else {
                sum += node.val;
            }
            node = node.next;
        }
        return head.next;   
    }
}