package SlidingWindow;

public class MinWindowSubstring {
    public String minWindow(String s, String t) {
        int l = 0, r = 0, minL = 0, minR = 0;
        String minString = "";
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        s = s.toLowerCase();
        t = t.toLowerCase();
        for (int i = 0; i < t.length(); i++) {
            freq2[t.charAt(i) - 'a']++;
        }
        int len = 0, minLength = Integer.MAX_VALUE;
        while (r < s.length()) {
            freq1[s.charAt(r) - 'a']++;
            char lc = s.charAt(l);
            char rc = s.charAt(r);
            if (!t.contains(String.valueOf(rc))) {
                l = r + 1;
                freq1 = new int[26];
                continue;
            }
            if (sContainsT(freq1, freq2)) {
                len = r - l + 1;
                if (len < minLength) {
                    minLength = len;
                    minL = l;
                    minR = r;
                }
            }
            r++;
        }
        return (minLength == Integer.MAX_VALUE) ? "" : s.substring(minL, minR + 1);
    }
    public boolean sContainsT(int[] freq1, int[] freq2) {
        for (int i = 0; i < freq1.length; i++) {
            if (freq2[i] > freq1[i])
                return false;
        }
        return true;
    }
}
