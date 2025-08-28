package Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class DailyTemps {
    public static void main(String[] args) {
        int [] temps = {30,38,30,36,35,40,28};
        System.out.println(Arrays.toString(dailyTemperatures(temps)));
    }
    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Deque<Integer> stack = new ArrayDeque<>(); // stack stores indices

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                res[prevIndex] = i - prevIndex; // calculate how many days
            }
            stack.push(i); // push current index
        }

        return res;
    }
}
