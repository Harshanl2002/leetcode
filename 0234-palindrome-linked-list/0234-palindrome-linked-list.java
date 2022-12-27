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
        Stack<ListNode> s=new Stack<>();
        ListNode curr=head,temp;
        while(curr!=null)
        {
            s.push(curr);
            curr=curr.next;
        }
        curr=head;
        while(!s.empty())
        {
            temp=s.peek();
            System.out.println(temp.val+" "+curr.val);
            if(curr.val!=temp.val)
            {
                return false;
            }
            s.pop();
            curr=curr.next;
        }
        return true;
    }
}