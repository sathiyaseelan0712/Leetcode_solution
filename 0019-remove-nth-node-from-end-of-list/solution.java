/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private int length(ListNode head){
        ListNode temp = new ListNode();
        temp = head;
        int count =0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int len = length(head);
        int pos = len - n;
        if(len == 1){
            return null;
        }
        int cur = 1;
        while(cur < pos){
            temp = temp.next;
            cur++;
        }
        if(len == n) head = head.next;
        else temp.next = temp.next.next;
        return head;     
    }
}
