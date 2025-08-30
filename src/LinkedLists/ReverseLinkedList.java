package LinkedLists;

import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {
        List<?> A = List.of("A", "B");
        List<?> B = A;



        B = List.of();
        System.out.println(A);
        System.out.println(B);
    }
    public ListNode reverseList(ListNode head) {
        // n1 -> n2 -> n3 -> n4

        ListNode prev = null;
        ListNode current = head;
        while (current != null) { // In this loop, you only play with one node.
            // You save its next
            ListNode nextTemp = current.next;
            // You set its next to point where the previous pointer is pointing
            current.next = prev;
            // You have previous point to where current points
            prev = current;
            // You move current forward
            current = nextTemp;
        }
        return prev;
    }
}
