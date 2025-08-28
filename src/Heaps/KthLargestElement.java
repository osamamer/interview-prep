package Heaps;

import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) { // Keep only the K largest elements by removing the smallest if size exceeds K
                minHeap.poll();
            }
        }
        return minHeap.peek(); // Smallest of these K elements is the Kth largest. Smallest of 2 largest elements is 2nd largest.
    }
}
