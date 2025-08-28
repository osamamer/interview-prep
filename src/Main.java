import SlidingWindow.MinSizeSubarraySum;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] nums = {2,3,1,2,4,3};
        int target = 7;
        String s = "ABBB";
        System.out.println(MinSizeSubarraySum.minSubArrayLen(target, nums));
    }
}