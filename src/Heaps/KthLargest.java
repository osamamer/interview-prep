package Heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class KthLargest {
    PriorityQueue<Integer> minHeap;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            minHeap.offer(nums[i]);
            if (minHeap.size() > k)
                minHeap.poll();
        }
    }

    public int add(int val) {
        minHeap.offer(val);
        if (minHeap.size() > k)
            minHeap.poll();
        return minHeap.peek();
    }
}

