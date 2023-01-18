/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} k
 * @return {ListNode}
 */
class stack
{
    constructor()
    {
        this.I=[];
    }
    push(ele)
    {
        return  this.I.push(ele);
    }
    pop()
    {
        if(this.I.length > 0) {
            return this.I.pop();
        }
    }
    peek()
    {
        if(this.I.length > 0) {
            return this.I[this.I.length-1];
        }
    }
    
}

var reverse=(head, k)=>{
    var s=new stack();
    var dummy=head,a=0;
    while(a<k&&dummy!=null)
        {
            
            s.push(dummy.val);
            // System.out.print(s.peek());
            console.log(s.peek());
            dummy=dummy.next;
            a++;
        }
        dummy=head;
        a=0;
         while(a<k&&dummy!=null)
        {
            dummy.val=s.peek();
            // System.out.print(s.peek()+" ");
            // console.log(s.peek());
            s.pop();
            dummy=dummy.next;
            a++;
        }
}

var reverseKGroup = function(head, k) {
    var curr=head,prev=head,a=1;
    while(curr!=null)
        {
            if(a%k===0)
            {
                reverse(prev,k);
                prev=curr.next;
            }
            curr=curr.next;
            a++;
        }
    return head;
};