import java.util.*;

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
    public void practiceMethod(int i) {
        HashMap<String, String> map = new HashMap<>();
        map.put("", "");
        List<Double> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
        Collections.sort(list);
        int[] arr = new int[5];
        List<Integer> lisy= new ArrayList<>(List.of(3, 1, 2, 4));
        String s = "";
        StringBuilder sb = new StringBuilder();
        sb.append('s');
        s = sb.toString();
        list.sort(( a,  b) -> Double.compare(b, a));
    }
}