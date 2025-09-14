package DynamicProgramming;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s.length() == 1)
            return s;
        String longestPal = "";
        outerLoop:
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= i; j--) {
                String pal = s.substring(i, j + 1);
                if (!isPalindrome(pal)) {
                    continue;
                }
                if (pal.length() > longestPal.length()) {
                    longestPal = pal;
                }
                continue outerLoop;
            }
        }
        return longestPal;
    }
    public boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
}
