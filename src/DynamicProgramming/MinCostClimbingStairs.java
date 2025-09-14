package DynamicProgramming;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] newCost = new int[cost.length + 1];
        for (int i = 0; i < cost.length; i++) {
            newCost[i] = cost[i];
        }
        newCost[newCost.length - 1] = 0;
        for (int i = newCost.length - 1; i >= 0 ; i--) { // WHEN THE LOOP IS DESCENDING i >= OR EQUAL TO ZERO!!!!!!
            if (i >= newCost.length - 2) {
                continue;
            }
            newCost[i] = Math.min(newCost[i] + newCost[i + 1], newCost[i] + newCost[i + 2]);
        }
        return Math.min(newCost[0], newCost[1]);
    }
}
