package TwoPointers;

import java.util.PriorityQueue;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        if (s.length() > t.length())
            return false;
        if (t.isEmpty() || s.isEmpty())
            return true;
        while (j < t.length()) {
            if (s.charAt(i) == t.charAt(j))
                i++;
            if (i == s.length())
                return true;
            j++;
        }
        return false;
    }

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            minHeap.offer(nums[i]);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
}
