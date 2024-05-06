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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1)
            return head;
        int count = 0;
        ListNode cur = head;
        while(cur!=null)
        {
            count++;
            cur=cur.next;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode c=dummy,nex=dummy,pre=dummy;
        while(count>=k){
            c=pre.next;
            nex=c.next;
            for(int i=1;i<k;i++)
            {
                c.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=c.next;
            }
            count-=k;
            pre=c;
        }
        return dummy.next;
    }
}
