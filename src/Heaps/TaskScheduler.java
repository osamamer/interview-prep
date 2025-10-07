package Heaps;

import java.util.*;

public class TaskScheduler {
    static class Pair {
        char c;
        int freq;
        public Pair(char c, int freq) {
            this.c = c;
            this.freq = freq;
        }
    }
    public int leastInterval(char[] tasks, int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> queue = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        List<Character> list = new ArrayList<>();
        for (int i = 0; i < tasks.length; i++) {
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
        }
        for (int i = 0; i < tasks.length; i++) {
            queue.offer(tasks[i]);
        }
        int idles = 0;
        int nCounter = n;
        int cycles = 0;
        while (!queue.isEmpty()) {
            if (queue.peek() != list.getLast()) {
                queue.poll();
                cycles++;
                continue;
            }
        }
        return 0;
    }
}
