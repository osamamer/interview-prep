package Arrays;

import java.util.ArrayList;
import java.util.List;

public class CandyPedo {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> bools = new ArrayList<>();
        int max = 0;
        for (int num : candies) {
            max = Math.max(max, num);
        }
        for (int num : candies) {
            bools.add(num + extraCandies >= max);
        }
        return bools;
    }
}
