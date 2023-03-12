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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode head = new ListNode(-1);
         ListNode curr = head;
         
         while (list1 != null && list2 != null){
             if (list2.val > list1.val){
                 curr.next = list1;
                 list1 = list1.next;
             }else {
                 curr.next = list2;
                 list2 = list2.next;
             }
             curr = curr.next;
         }
         curr.next = list1 == null ? list2 : list1;
         return head.next;    
    }
}