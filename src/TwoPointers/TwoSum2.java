package TwoPointers;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        int [] indices = new int[2];
        while (i < j) {
            if (numbers[i] + numbers[j] > target)
                j--;
            else if (numbers[i] + numbers[j] < target)
                i++;
            else {
                indices = new int[]{i + 1, j + 1};
                break;
            }

        }
        return indices;
    }
}
