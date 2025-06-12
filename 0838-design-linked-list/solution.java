class MyLinkedList {
    // class Node {
    //     int val;
    //     Node next;

    //     Node() {}
    //     Node(int _val) {
    //         val = _val;
    //         next = null;
    //     }
    // }

    // Node head;

    // public MyLinkedList() {
    //     head = null;
    // }

    // public int get(int index) {
    //     Node cur = head;
    //     int count = 0;
    //     while (cur != null && count < index) {
    //         cur = cur.next;
    //         count++;
    //     }
    //     return (cur != null) ? cur.val : -1;
    // }

    // public void addAtHead(int val) {
    //     Node temp = new Node(val);
    //     temp.next = head;
    //     head = temp;
    // }

    // public void addAtTail(int val) {
    //     Node temp = new Node(val);
    //     if (head == null) {
    //         head = temp;
    //     } else {
    //         Node cur = head;
    //         while (cur.next != null) {
    //             cur = cur.next;
    //         }
    //         cur.next = temp;
    //     }
    // }

    // public void addAtIndex(int index, int val) {
    //     if (index == 0) {
    //         addAtHead(val);
    //         return;
    //     }

    //     Node temp = new Node(val);
    //     Node cur = head;
    //     int count = 0;

    //     while (cur != null && count < index - 1) {
    //         cur = cur.next;
    //         count++;
    //     }

    //     if (cur == null) {
    //         return;
    //     }

    //     temp.next = cur.next;
    //     cur.next = temp;
    // }

    // public void deleteAtIndex(int index) {
    //     if (head == null) return;

    //     if (index == 0) {
    //         head = head.next;
    //         return;
    //     }

    //     Node cur = head;
    //     int count = 0;

    //     while (cur != null && count < index - 1) {
    //         cur = cur.next;
    //         count++;
    //     }

    //     if (cur == null || cur.next == null) return;

    //     cur.next = cur.next.next;
    // }

    private List<Integer> list;

    public MyLinkedList() {
        list = new LinkedList<>();
    }

    public int get(int index) {
        if (index >= 0 && index < list.size()) {
            return list.get(index);
        }
        return -1;
    }

    public void addAtHead(int val) {
        list.add(0, val);
    }

    public void addAtTail(int val) {
        list.add(val);
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > list.size()) {
            return;
        }
        list.add(index, val);
    }

    public void deleteAtIndex(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }
    }
}

