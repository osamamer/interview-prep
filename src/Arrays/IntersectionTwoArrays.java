package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intSet = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            if (set1.contains(num))
                intSet.add(num);
        }
        int[] intArr = new int[intSet.size()];
        int i  = 0;
        for (int num : intSet) {
            intArr[i] = num;
            i++;
        }
        return intArr;
    }
}
