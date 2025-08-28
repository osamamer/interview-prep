package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    List<List<String>> palindromes = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtrack(s, new ArrayList<>(), 0);
        return palindromes;
    }

    private void backtrack(String s, List<String> current, int start) {
        // Base case: reached the end of the string
        if (start == s.length()) {
            palindromes.add(new ArrayList<>(current));
            return;
        }

        // Try all substrings starting at 'start'
        for (int end = start; end < s.length(); end++) { // For loop represents breadth, calls within represent depth
            // Skipping a call means cutting off that branch and not continuing.
            String sub = s.substring(start, end + 1); // substring including start..end
            if (isPalindrome(sub)) {
                current.add(sub);                   // Choose
                backtrack(s, current, end + 1);     // Explore
                current.remove(current.size() - 1); // Backtrack
            }
        }
    }

    // Standard palindrome check
    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}
