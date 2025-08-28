package TwoPointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = getAlphanumeric(s);
        s = s.toLowerCase();
        if (s.length() <= 1)
            return true;

        for (int i = 0, j = s.length() - 1; i < s.length()/2; i++, j--) {
            if (s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }
    public static String getAlphanumeric(String inputString) {
        // The regex "[^a-zA-Z0-9]" matches any character that is NOT
        // an uppercase letter (A-Z), a lowercase letter (a-z), or a digit (0-9).
        // These matched characters are replaced with an empty string, effectively removing them.
        return inputString.replaceAll("[^a-zA-Z0-9]", "");
    }
}
