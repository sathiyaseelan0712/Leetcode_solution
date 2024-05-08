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
        final int le=getLength(head);
        ListNode dummy = new ListNode(0,head);
        ListNode pr=dummy;
        ListNode cu=head;
        for(int i=0;i<le/2;i++){
            ListNode nex=cu.next;
            cu.next=nex.next;
            nex.next=cu;
            pr.next=nex;
            pr=cu;
            cu=cu.next;
        }
        return dummy.next;
    }
        private int getLength(ListNode head){
            int count=0;
            ListNode cur=head;
            while(cur!=null){
                cur=cur.next;
                count++;
            }
            return count;
        }
}
