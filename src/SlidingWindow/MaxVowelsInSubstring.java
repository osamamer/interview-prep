package SlidingWindow;

import java.util.HashSet;

public class MaxVowelsInSubstring {
    public int maxVowels(String s, int k) {
        int left = 0, right = 0;
        int count = 0;
        int maxCount = 0;
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        while (right < s.length()) {
            if (vowels.contains(s.charAt(right))) {
                count++;
            }
            if (right - left + 1 == k) {
                maxCount = Math.max(maxCount, count);
                count = vowels.contains(s.charAt(left)) ? count - 1 : count;
                left++;
            }
            right++;
        }
        return maxCount;
    }
}
