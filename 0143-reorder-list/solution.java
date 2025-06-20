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
    public ListNode getMiddle(ListNode root) {
        ListNode slow = root;
        ListNode fast = root;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode reverseList(ListNode root) {
        ListNode temp = root;
        ListNode prev = null;
        while (temp != null) {
            ListNode cur = temp.next;
            temp.next = prev;
            prev = temp;
            temp = cur;
        }
        return prev;
    }

    public void merge(ListNode first, ListNode second) {
        while (first != null && second != null) {
            ListNode firstNode = first.next;
            ListNode secondNode = second.next;

            first.next = second;

            if (firstNode == null)
                break;
            second.next = firstNode;

            first = firstNode;
            second = secondNode;

        }
    }

    public void reorderList(ListNode head) {
        ListNode middle = getMiddle(head);
        ListNode reverse = reverseList(middle.next);
        middle.next = null;

        merge(head, reverse);
    }
}
