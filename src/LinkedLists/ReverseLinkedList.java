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
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }
}
