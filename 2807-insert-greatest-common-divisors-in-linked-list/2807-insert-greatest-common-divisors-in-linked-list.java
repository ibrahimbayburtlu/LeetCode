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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
       ListNode currNode = head;
        
        while(currNode.next != null){
            
            ListNode newNode = new ListNode(calculateGreatestCommonDivisor(currNode.val, currNode.next.val), currNode.next);
            
            currNode.next = newNode;
            
            currNode = currNode.next.next;
        }
        return head;
    }
    
    private int calculateGreatestCommonDivisor(int a, int b){
        int num = Math.min(a,b);
        
        int maxNumber = 1;
        for (int i = 2; i <= num; i++) {
            if (a % i == 0 && b % i == 0) {
                maxNumber = i;
            }
        }
        return maxNumber;
    }
}