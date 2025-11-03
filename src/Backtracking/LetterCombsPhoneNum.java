package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class LetterCombsPhoneNum { // FIRST TRY BABYYYYYYYYYYYYYYYYYYYYYYYYYYY!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    Map<Character, String> phoneMap = new HashMap<>();


    List<String> combs = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        phoneMap.put('1', "");
        phoneMap.put('2', "abc");
        phoneMap.put('3', "def");
        phoneMap.put('4', "ghi");
        phoneMap.put('5', "jkl");
        phoneMap.put('6', "mno");
        phoneMap.put('7', "pqrs");
        phoneMap.put('8', "tuv");
        phoneMap.put('9', "wxyz");
        phoneMap.put('0', " ");
        backtrack(digits, 0, new StringBuilder());
        return combs;
    }
    public void backtrack(String digits, int start, StringBuilder curr) {
        if (curr.length() == digits.length()) {
            combs.add(curr.toString());
            return;
        }

        for (int i = start; i < digits.length(); i++) {
            char[] chars = phoneMap.get(digits.charAt(i)).toCharArray();
            for (int j = 0; j < chars.length; j++) {
                curr.append(chars[j]);
                backtrack(digits, i + 1, curr);
                curr.deleteCharAt(curr.length() - 1);
            }
        }
    }
}
