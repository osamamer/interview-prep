package SlidingWindow;

import java.util.HashSet;

public class LongestSubstringNoRepeat {
    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty())
            return 0;
        if (s.length() == 1)
            return 1;
        int maxLength = 1;
        HashSet<Character> hashSet = new HashSet<>();
        int left = 0, right = 0;
        while (right < s.length()) {
            char rightChar = s.charAt(right);
            char leftChar = s.charAt(left);
            if (!hashSet.contains(rightChar)) {
                hashSet.add(rightChar);
                right++;
            }
            else {
                hashSet.remove(leftChar);
                left++;
            }
            maxLength = Math.max(maxLength, hashSet.size());
        }
        return maxLength;
    }
}
