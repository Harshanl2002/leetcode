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
    void  reverseKele(ListNode head, int k)
    {
        int a=0;
        ListNode dummy=head;
        Stack<Integer> s=new Stack<Integer>();
        while(a<k&&dummy!=null)
        {
            
            s.push(dummy.val);
            System.out.print(s.peek());
            dummy=dummy.next;
            a++;
        }
        dummy=head;
        a=0;
         while(a<k&&dummy!=null)
        {
            dummy.val=s.peek();
            System.out.print(s.peek()+" ");
             s.pop();
            dummy=dummy.next;
            a++;
        }
        
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int a=1;
        ListNode curr=head,prev=head;
        while(curr!=null)
        {
            if(a%k==0)
            {
                reverseKele(prev,k);
                prev=curr.next;
            }
            curr=curr.next;
            a++;
        }
        
        return head;
    }
}