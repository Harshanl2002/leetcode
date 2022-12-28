/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null)
        {
            return null;
        }
        ListNode slow=head,fast=head;
        
        while(fast!=null)
        {
            fast=fast.next;
            if(fast!=null)
            {
                fast=fast.next;
                slow=slow.next;
            }
            if(slow==fast)
            {
                while(slow!=head){
                    slow=slow.next;
                    head=head.next;
                }
                return slow;
            }
        }
        return null;
    }
}