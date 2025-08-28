package Strings;

import java.util.HashSet;

public class ReverseVowels {
    public String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        StringBuilder stringBuilder = new StringBuilder(s);
        for (int i = 0, j = s.length() - 1; i < j;) {
            if (vowels.contains(s.charAt(i)) && vowels.contains(s.charAt(j))) {
                char temp = s.charAt(i);
                stringBuilder.setCharAt(i, s.charAt(j));
                stringBuilder.setCharAt(j, temp);
                i++;
                j--; // YOU RETARD YOU FORGOT TO INCREMENT IN THIS CASE!!!
            }
            if (!vowels.contains(s.charAt(i))) {
                i++;
            }
            if (!vowels.contains(s.charAt(j))) {
                j--;
            }
        }
        return stringBuilder.toString();
    }
}
