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
    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public ListNode reverse(ListNode root){
        ListNode prev = null;
        ListNode temp = root;

        while(temp != null){
            ListNode cur = null;
            cur = temp.next;
            temp.next = prev;
            prev = temp;
            temp = cur;
        }

        return prev;

    }
    public void printList(ListNode root){
        ListNode cur = root;
        while(cur != null){
            System.out.print(cur.val + "->");
            cur =cur.next;
        }
    } 

    private ListNode front;
    public boolean isPalindrome(ListNode head) {
        // ListNode lastHalf = middle(head);
        // ListNode reverseList = reverse(lastHalf);
        
        // ListNode temp = reverseList;
        // ListNode temp2 = head;
        // while(temp != null && temp2 != null){
        //     if(temp.val != temp2.val){
        //         return false;
        //     }
        //     temp = temp.next;
        //     temp2 = temp2.next;
        // }

        // Stack<Integer> s = new Stack();
        // ListNode temp = head;

        // while(temp != null){
        //     s.push(temp.val);
        //     temp = temp.next;
        // }        

        // temp = head;

        // while(temp != null){
        //     if(s.peek() != temp.val){
        //         return false;
        //     }
        //     s.pop();
        //     temp = temp.next;
        // }

        // return true;
        front = head;
        return check(head);
    }

    public boolean check(ListNode cur){
        if(cur == null) return true;

        boolean isPal = check(cur.next);

        if(!isPal) return false;

        if(cur.val != front.val) return false;

        front = front.next;

        return true;
    }
}
