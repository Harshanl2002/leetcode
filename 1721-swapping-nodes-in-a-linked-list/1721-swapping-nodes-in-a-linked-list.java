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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr=head,ks,kend=head;
        for(int i=0;i<k-1;i++)
        {
            curr=curr.next;
        }
        ks=curr;
        while(curr.next!=null)
        {
            kend=kend.next;
            curr=curr.next;
        }
        ListNode t=new ListNode(ks.val,null);
        ks.val=kend.val;
        kend.val=t.val;
        return head;
    }
}