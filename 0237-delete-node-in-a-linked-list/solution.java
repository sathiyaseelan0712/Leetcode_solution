/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp=node.next;
        int value = temp.val;
        node.val=value;
        node.next=temp.next;
        temp.next=null;

        
    }
}
