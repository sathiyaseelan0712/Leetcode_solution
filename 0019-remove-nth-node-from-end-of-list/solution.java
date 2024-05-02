class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode();
        start.next = head;
        ListNode fast = start;
        ListNode slow = start;
        ListNode cur = head;
        int count = 0;
        
        // Count the total number of nodes in the list
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        
        // Move the fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        
        // If there's only one node in the list, return null
        if (count == 1) {
            return null;
        }
        
        // Move both pointers until the fast one reaches the end
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        // Remove the nth node from the end
        slow.next = slow.next.next;
        
        // Return the modified head
        return start.next;
    }
}

