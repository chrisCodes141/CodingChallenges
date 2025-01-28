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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //handle edge case of removing the head
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Move the first pointer n+1 steps ahead to maintain the gap
        for (int i = 1; i <= n + 1; i++) {
            if (first != null) {
                first = first.next;
            }
        }

        // Move both pointers one step at a time until the first pointer reaches the end
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // Remove the nth node from the end by adjusting the second pointer's next
        if (second != null && second.next != null) {
            second.next = second.next.next;
        }

        // Update the head in case the head was removed
        return head = dummy.next;
    }
}