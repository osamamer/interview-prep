package SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;

public class PermutationString {

    public static void main(String[] args) {
        String s1 = "";
        String s2 = "123";

    }
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int [] s1Count = new int [26];
        int [] windowCount = new int [26];
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
        }
        int left = 0;
        for (int right = 0; right < s2.length(); right++) {
            char leftChar = s2.charAt(left);
            char rightChar = s2.charAt(right);
            windowCount[rightChar - 'a']++;

            if (right - left + 1 > s1.length()) {
                windowCount[leftChar - 'a']--;
                left++;
            }

            if (right - left + 1 == s1.length() && Arrays.equals(s1Count, windowCount)) {
                return true;
            }
        }
        return false;
    }
}
