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
    public ListNode middleNode(ListNode head) {
        ListNode curr = head;
        ListNode temp = head;
        int count = 0;
        while(curr != null){
            count ++;
            curr = curr.next;
        }
        int n = (count / 2 );
        for(int i = 0; i < n;i++){
            temp = temp.next;
        } 
        return temp;
    }
}