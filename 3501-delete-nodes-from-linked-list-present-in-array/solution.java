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
    // public ListNode deleteNodeWithValue(ListNode head,int _val){
    //     while(head.val == _val){
    //         head = head.next;
    //     }
    //     // System.out.println(_val);
    //     ListNode temp = head;
    //     ListNode prev = head;
    //     while(temp != null){
    //         if(temp.val == _val){
    //             prev.next = temp.next;
    //         }else{
    //             prev = temp;
    //         }
    //         temp = temp.next;
    //     }
    //     return head;
    // }
    public ListNode modifiedList(int[] nums, ListNode head) {
      Set<Integer> hash = new HashSet<>();
      for(int i : nums){
        hash.add(i);
      }
      ListNode dummy = new ListNode(0);
      dummy.next = head;
      ListNode temp = dummy;
      ListNode prev = dummy;

      while(temp != null){
        if(hash.contains(temp.val)){
            prev.next = temp.next;
        }else{
            prev = temp;
        }
        temp = temp.next;
      }

      return dummy.next;
    }
}
