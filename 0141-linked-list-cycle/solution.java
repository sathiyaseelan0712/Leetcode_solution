/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast =  head;
        ListNode slow =  head;
        while(fast != null){
            fast = fast.next;
            if(fast != null){
                slow = slow.next;
                fast = fast.next;
            }
            if(fast == slow){
                return true;
            }
        }
        return false;
    }
}
