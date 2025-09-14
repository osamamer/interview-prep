package LinkedLists;

public class ReverseNMerge {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow = head, fast = head;
        // Find the middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        } // slow is the middle node
        ListNode second = slow.next;
        slow.next = null; // DISCONNECT THE TWO HALVES!!!
        // Reverse the second half
        ListNode prev = null, curr = second;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev; // curr.next now points to where prev points
            prev = curr; // prev now points to a different place, not at itself. Get it?
            curr = nextTemp;
        }
        // Merge
        ListNode first = head;
        second = prev; // because it's the last one we reversed, not curr. curr is now null
        // because we broke out of the loop
        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1; // Connect the chain.

            first = temp1;
            second = temp2;
        }
    }
}
