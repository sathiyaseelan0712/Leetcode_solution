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
    public ListNode getMiddle(ListNode root){
        ListNode fast = root;
        ListNode slow = root;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    } 
    public ListNode reverse(ListNode root){
        ListNode temp = root;
        ListNode prev = null;
        while(temp != null){
            ListNode cur = temp;
            temp = temp.next;
            cur.next = prev;
            prev = cur;
        }
        return prev;
    }
    public void printList(ListNode root){
        ListNode cur = root;
        while(cur != null){
            System.out.print(cur.val + " ");
            cur =cur.next;
        }
        System.out.println();
    }
    public int pairSum(ListNode head) {
        ListNode middle = getMiddle(head);
        ListNode rev = reverse(middle);
        middle.next = null;
        int max = Integer.MIN_VALUE;
        ListNode temp1 = head;
        ListNode temp2 = rev;
        while(temp1 != null && temp2 != null){
            max = Math.max(max, temp1.val + temp2.val);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return max;
    }
}
