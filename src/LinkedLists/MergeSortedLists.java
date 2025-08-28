package LinkedLists;

public class MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        // Dummy node so we always have a 'tail' to add to
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while (list1 != null || list2 != null) {
            int val1 = (list1 != null) ? list1.val : Integer.MAX_VALUE;
            int val2 = (list2 != null) ? list2.val : Integer.MAX_VALUE;

            if (val1 <= val2) {
                tail.next = new ListNode(val1); // Create new node
                list1 = (list1 != null) ? list1.next : null;
            } else {
                tail.next = new ListNode(val2);
                list2 = (list2 != null) ? list2.next : null;
            }

            tail = tail.next; // Move tail forward
        }

        return dummy.next; // Skip dummy node
    }
}
