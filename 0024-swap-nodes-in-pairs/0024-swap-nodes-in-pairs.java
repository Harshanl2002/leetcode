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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        ListNode d=new ListNode(0,head);
        ListNode dh=d;
        ListNode a=head,b=head.next,c=head.next.next;
        while(true)
        {
            dh.next=b;
            b.next=a;
            a.next=c;
            if(c==null||c.next==null)
            {
                break;
            }
            dh=a;
            a=a.next;
            b=c.next;
            c=c.next.next;
        }
        return d.next;
    }
}