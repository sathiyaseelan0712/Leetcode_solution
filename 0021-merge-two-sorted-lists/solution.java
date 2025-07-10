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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode ansHead = null;
        ListNode ansCur = null;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                if (ansHead == null) {
                    ansHead = temp1;
                    ansCur = temp1;
                } else {
                    ansCur.next = temp1;
                    ansCur = temp1;
                }
                temp1 = temp1.next;
            } else {
                if (ansHead == null) {
                    ansHead = temp2;
                    ansCur = temp2;
                } else {
                    ansCur.next = temp2;
                    ansCur = temp2;
                }
                temp2 = temp2.next;
            }
        }
        while (temp1 != null) {
            if (ansHead == null) {
                ansHead = temp1;
                ansCur = temp1;
            } else {
                ansCur.next = temp1;
                ansCur = temp1;
            }
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            if (ansHead == null) {
                ansHead = temp2;
                ansCur = temp2;
            } else {
                ansCur.next = temp2;
                ansCur = temp2;
            }
            temp2 = temp2.next;
        }
        return ansHead;
    }
}
