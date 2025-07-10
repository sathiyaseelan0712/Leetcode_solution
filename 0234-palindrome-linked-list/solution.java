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
    public ListNode getmiddle(ListNode root){
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
    public boolean isPalindrome(ListNode head) {
        ListNode middle = getmiddle(head);
        ListNode rev = reverse(middle);
        // printList(rev);
        middle.next = null;
        ListNode temp = rev;
        ListNode temp2 = head;
        while(temp != null && temp2 !=null){
            if(temp.val != temp2.val){
                return false;
            }
            temp  = temp.next;
            temp2 = temp2.next;
        }
        return true;
    }
}
