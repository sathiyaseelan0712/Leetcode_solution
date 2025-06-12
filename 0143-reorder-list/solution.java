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
    public void printList(ListNode root){
        ListNode cur = root;
        while(cur != null){
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public ListNode getMiddle(ListNode head){
        ListNode  slow =head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        printList(slow);
        return slow;
    }

    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;

        while (current != null) {
            next = current.next;  
            current.next = prev;  
            prev = current;       
            current = next;       
        }
        printList(prev);
        return prev;
    }

     public void mergeList(ListNode first, ListNode second){
        while (first != null && second != null) {
            ListNode firstNext = first.next;
            ListNode secondNext = second.next;

            first.next = second;

            if (firstNext == null) break; 
            second.next = firstNext;

            first = firstNext;
            second = secondNext;
        }
    }

    public void reorderList(ListNode head) {
        ListNode middle = getMiddle(head);
          ListNode secondhalf = middle.next;
          middle.next = null;
          ListNode reverse = reverseList(secondhalf);
          mergeList(head, reverse);
    }

}
