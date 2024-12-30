/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeElements(struct ListNode* head, int val) {
    struct ListNode* temp = head;
    struct ListNode* prev = head;
    if (head == NULL) {
        return head;
    }
    while (head != NULL && head->val == val) {
        head = head->next;
    }
    while (temp != NULL) {
        if (temp->val == val) {
            prev->next = temp->next;
            // prev = temp;
            temp = temp->next;
        } else {
            prev = temp;
            temp = temp->next;
        }
        // prev = temp;
        // temp = temp->next;
    }
    return head;
}
