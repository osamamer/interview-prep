package HashMapOrSet;

import java.util.*;

public class DifferenceTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<List<Integer>> answers = new ArrayList<>();
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

        answers.add(list1);
        answers.add(list2);
        for (int num : nums1) {
            hashSet1.add(num);
        }
        for (int num : nums2) {
            hashSet2.add(num);
        }
        for (int num : hashSet1) {
            if (!hashSet2.contains(num))
                list1.add(num);
        }
        for (int num : hashSet2) {
            if (!hashSet1.contains(num))
                list2.add(num);
        }
        return answers;
    }

}
