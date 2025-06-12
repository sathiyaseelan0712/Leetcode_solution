/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private int length(ListNode root){
        int size = 0;
        ListNode cur = root;
        while(cur != null){
            size++;
            cur = cur.next;
        }
        return size;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA);
        int lenB = length(headB);

        while(lenA> lenB){
            headA = headA.next;
            lenA--;
        }

        while(lenB > lenA){
            headB = headB.next;
            lenB--;
        }

        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
