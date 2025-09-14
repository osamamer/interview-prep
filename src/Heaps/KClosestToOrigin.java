package Heaps;

import java.util.PriorityQueue;

public class KClosestToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        int [][] answer = new int[k][2];
        PriorityQueue<int []> minHeap = new PriorityQueue<>(
                (a, b) -> distance(a) - distance(b)  // if negative, first parameter goes first.
        );
        for (int [] point : points) {
            minHeap.offer(point);
        }
        for (int i = 0; i < k; i++) {
            answer[i] = minHeap.poll();
        }
        return answer;
    }
    public int distance (int [] point) {
        return point[0]*point[0] + point[1]*point[1];
    }
}
