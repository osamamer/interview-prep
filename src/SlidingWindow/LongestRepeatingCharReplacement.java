package SlidingWindow;

import java.util.Arrays;
import java.util.HashSet;

public class LongestRepeatingCharReplacement {
    public static int characterReplacement(String s, int k) {
        int maxLength = 1;
        int [] windowCount = new int [26];
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            int windowLength = right - left + 1;
            windowCount[s.charAt(right) - 'A']++;
            int maxCount = 0;
            for (int count : windowCount) {
                maxCount = Math.max(maxCount, count);
            }
            if (maxCount + k < windowLength) {
                windowCount[s.charAt(left) - 'A']--;
                left++;
                windowLength--; // YOU FORGOT TO ADJUST THE WINDOW LENGTH HERE!!!
            }
            maxLength = Math.max(maxLength, windowLength);
        }
        return maxLength;
    }
}
