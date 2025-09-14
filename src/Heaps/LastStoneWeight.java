package Heaps;

import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(stones));
    }
    public static int lastStoneWeight(int[] stones) {
        if (stones.length == 1)
            return stones[0];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b - a);
        for (int stone : stones) {
            maxHeap.offer(stone);
        }
        while (!maxHeap.isEmpty()) {
            if (maxHeap.size() == 1)
                return maxHeap.peek();
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();
            if (stone1 != stone2) {
                maxHeap.offer(Math.abs(stone1 - stone2));
            }
        }
        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}
