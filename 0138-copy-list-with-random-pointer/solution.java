/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> m = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            m.put(temp, new Node(temp.val));
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            m.get(temp).next = m.get(temp.next);
            m.get(temp).random = m.get(temp.random);
            temp = temp.next;
        }
        return m.get(head);
    }
}
