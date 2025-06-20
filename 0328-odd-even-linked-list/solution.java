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
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return null;
        }
        Queue<ListNode> q = new LinkedList<ListNode>();
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy.next;
        while(temp  != null && temp.next != null){
            q.add(temp.next);
            temp.next = temp.next.next;
            if(temp.next != null){
                temp = temp.next;
            }
        }
        while(!q.isEmpty()){
            temp.next = q.poll();
            temp = temp.next;
        }
        temp.next = null;
        
        return dummy.next;
    }
}
