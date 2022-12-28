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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null)
        {
            return null;
        }
        ListNode slow,fast,prev=null;
        slow=head;
        fast=head;
        while(fast!=null)
        {
            fast=fast.next;
            if(fast!=null)
            {
                fast=fast.next;
                prev=slow;
                slow=slow.next;
            }
        }
        prev.next=slow.next;
        return head;
        
    }
}