import java.util.ArrayList;
import java.util.List;

public class Practice {
    public double findMaxAverage(int[] nums, int k) {
        double average;
        double maxAverage = -Double.MAX_VALUE;
        double sum = 0;
        int l = 0, r = 0;
        while (r < nums.length) {
            sum += nums[r];
            if (r - l + 1 == k) {
                average = sum / k;
                maxAverage = Math.max(maxAverage, average);
            }
            else if (r - l + 1 > k) { // UNNECESSARY
                sum -= nums[l]; // THE ORDER OF THESE TWO STATEMENTS NIGGA!!!!
                l++;
                average = sum / k;
                maxAverage = Math.max(maxAverage, average); // YOU HAVE TO RECALCULATE HERE!!!
            }
            r++;
        }
        return maxAverage;
    }
}