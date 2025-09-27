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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;

        ListNode oddDummy = new ListNode();
        ListNode evenDummy = new ListNode();
        ListNode oddTail = oddDummy;
        ListNode evenTail = evenDummy;

        int count = 1;
        while (head != null) {
            ListNode newNode = new ListNode(head.val);
            if (count % 2 == 1) {  
                oddTail.next = newNode;
                oddTail = oddTail.next;
            } else {              
                evenTail.next = newNode;
                evenTail = evenTail.next;
            }
            count++;
            head = head.next;
        }


        oddTail.next = evenDummy.next;
        return oddDummy.next;
    }
}
