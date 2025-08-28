package LinkedLists;

import java.util.HashSet;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode tortoise = head;
        ListNode hare = head; // We can start them off at the same position and then increment at the beginning of the loop instead of the end (before checking the condition).
        // I think this is true for most problems. If you want to start them off at the same position (two pointers for instance), you need to update them before checking.
        while (hare != null && hare.next != null) { // YOU DIDN'T NULL PROOF IT BEFORE! You are accessing both hare and hare.next, so BOTH MUST BE NOT NULL!
            tortoise = tortoise.next;
            hare = hare.next.next;
            if (hare == tortoise)
                return true;
        }
        return false;
    }
}
