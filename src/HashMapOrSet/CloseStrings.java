package HashMapOrSet;

import java.util.Arrays;

public class CloseStrings {
    public boolean closeStrings(String word1, String word2) { // I got the conceptual idea, but not how to do it
        if (word1.length() != word2.length())
            return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        // Build frequency arrays
        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            arr1[c - 'a']++;
        }
        for (int i = 0; i < word2.length(); i++) {
            char c = word2.charAt(i);
            arr2[c - 'a']++;
        }
        // Check if one string contains a letter the other does not
        for (int i = 0; i < 26; i++) {
            if ((arr1[i] == 0 && arr2[i] != 0) || (arr1[i] != 0 && arr2[i] == 0))
                return false;
        }
        // Sort the frequencies
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        // Check if they have the same frequencies. Then they are close since they have the same letters.
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }
}
