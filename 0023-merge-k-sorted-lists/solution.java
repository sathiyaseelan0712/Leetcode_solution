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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(ListNode l : lists){
            ListNode cur = l;
            while(cur != null){
                arr.add(cur.val);
                cur = cur.next;
            }
        }
        ListNode head = null;
        ListNode curr = null;
        if(arr.isEmpty()){
            return head;
        }
        Collections.sort(arr);
        for(Integer i : arr){
            ListNode temp = new ListNode(i);
            if(head == null){
                head = temp;
                curr = temp;
            }else{
                curr.next = temp;
                curr = curr.next;
            }
        }
        
        // System.out.println(arr.toString());
        return head;
    }
}
