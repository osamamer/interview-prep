package Graphs;

import java.util.HashSet;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        HashSet<Integer> visited = new HashSet<>();
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited.contains(i * j)) {
                    visited.add(i * j);
                    count++;
                }
            }
        }
        return count;
    }
}
