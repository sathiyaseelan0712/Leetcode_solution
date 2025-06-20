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
    public int count(ListNode head){
        int cnt = 0;
        ListNode temp =head;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null  || k == 1){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy, next = dummy, prev = dummy;
        int n =count(head);
        while(n >= k){
            cur = prev.next;
            next = cur.next;
            for(int i = 1;i<k;i++){
                cur.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = cur.next;
            }
            n -= k;
            prev = cur;
        }
        return dummy.next;
    }
}
