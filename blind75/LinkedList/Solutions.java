package blind75.LinkedList;
class ListNode{
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }

}

class Solutions {

    static ListNode lN = new ListNode();

    public static void reverseListGloballyRecuersively(ListNode head) {

        while(head.next != null){
            reverseListGloballyRecuersively(head.next);
        }
        lN.val = head.val;
    }

    // O(n) time | O(1) space

    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)   return head;

        ListNode prev = null;
        ListNode cur = head;
        ListNode next_node;

        while(cur != null)
        {
            next_node = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next_node;
        }
        return prev;
    }


    //Merge two sorted singly linked lists

    public static ListNode mergeTwoSortedLists(ListNode list1, ListNode list2){
        if(list1 == null || list2 == null) return list1 == null ? list2 : list1;

        ListNode head = new ListNode(-1);
        ListNode cur = head;

        while(list1 != null && list2 != null){

            if(list1.val < list2.val){
                cur.next = list1;
                cur = list1;
                list1 = list1.next;
            }
            else{
                cur.next = list2;
                cur = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        // point to remainder of the list that's not null
        if(list1 != null) cur.next = list1;
        if(list2 != null) cur.next = list2;

        return head;
    }

}