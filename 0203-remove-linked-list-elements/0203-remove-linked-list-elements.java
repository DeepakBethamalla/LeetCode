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
    public ListNode removeElements(ListNode head, int val) {
       
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(-1);
         dummy.next = head;
        ListNode current = dummy;
        while(current.next != null){
            if(current.next.val != val){
                current = current.next;
            }else{
               current.next  = current.next.next;
            }
        }
        return dummy.next;
    }
}