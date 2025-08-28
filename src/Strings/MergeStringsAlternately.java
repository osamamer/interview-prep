package Strings;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder mergedString = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) mergedString.append(word1.charAt(i));
            if (i < word2.length()) mergedString.append(word2.charAt(i));
            i++;
        }
        return mergedString.toString();
    }
}
