package TwoPointers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        for (int left = 0; left < nums.length - 1; left++) {
            HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();
            for (int right = left + 1; right < nums.length; right++) {
                int sum = nums[right] + nums[left];
                if (hashMap.containsKey(nums[right] * -1)) {
                    boolean duplicate = false;
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(hashMap.get(-nums[right]).get(0));
                    triplet.add(hashMap.get(-nums[right]).get(1));
                    triplet.add(nums[right]);
                    for (int i = 0; i < triplets.size(); i++) {
                        if (new HashSet<>(triplets.get(i)).containsAll(triplet)) {
                            duplicate = true;
                            break;
                        }
                    }
                    if (!duplicate) {
                        triplets.add(triplet);
                    }
                }
                ArrayList<Integer> list = new ArrayList<>();
                list.add(nums[left]);
                list.add(nums[right]);
                hashMap.put(sum, list);
            }
        }
        return triplets;
    }
}
