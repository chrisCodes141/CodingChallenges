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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            // if node has value, store it, if not, 0
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            // get the sum, save any carry
            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            //create next node of tail, make that the tail tip
            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            //traverse to next node in Nodelists if not null
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        ListNode result = dummyHead.next;
        dummyHead = null;
        return result;
    }
}