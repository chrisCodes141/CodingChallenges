class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head; // Edge case: empty list or single node

        ListNode dummy = new ListNode(0);  // Dummy node to simplify swaps
        dummy.next = head;
        ListNode prev = dummy;             // Previous node to track the last swapped node
        ListNode trailing = head;          // First node of the pair
        ListNode leading = head.next;      // Second node of the pair

        while (trailing != null && leading != null) {
            // Swap nodes
            trailing.next = leading.next;
            leading.next = trailing;
            prev.next = leading;

            // Move pointers forward for the next pair
            prev = trailing;
            trailing = trailing.next; // Move to next pair

            if (trailing != null) {
                leading = trailing.next; // Next second node
            }
        }

        return dummy.next;
    }
}