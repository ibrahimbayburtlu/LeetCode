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
    public boolean isPalindrome(ListNode head) {
        ArrayList<List> arrayList = new ArrayList<>();
        while (head!= null){
            int value = head.val;
            arrayList.add(Collections.singletonList(value));
            head = head.next;
        }
        return isPalindromeArr(arrayList);
    }
    
    public static boolean isPalindromeArr(ArrayList arr){
        for (int i = 0; i < arr.size() / 2; i++){
            if (!Objects.equals(arr.get(i), arr.get(arr.size() - 1 - i))){
                return false;
            }
        }
        return true;
    }
}