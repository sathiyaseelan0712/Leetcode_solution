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
    public ListNode insertionSortList(ListNode head) {
        ListNode ans = null, res = null;

        while(head != null){
            ListNode temp = head, prev = null, minPrev = null, minTemp = temp;
            int minimum = temp.val;
            while(temp  != null){
                if(minimum > temp.val){
                    minTemp = temp;
                    minPrev = prev;
                    minimum = temp.val;
                }
                prev = temp;
                temp = temp.next;
            }
            if(minPrev == null){
                head = head.next;
            }
            if(ans == null){
                ans = minTemp;
                res = minTemp;
            }else{
                if(minPrev != null){
                    minPrev.next = minTemp.next;
                }
                res.next = minTemp;
                res = res.next;
            }
        }
        return ans;
    }
}
