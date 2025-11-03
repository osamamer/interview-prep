package Stack;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        int repeat = 1;
        Stack<Integer> intStack = new Stack<>();
        Stack<Integer> stringStack = new Stack<>();
        StringBuilder outBuilder = new StringBuilder();
        StringBuilder expBuilder = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                intStack.push(Integer.parseInt(String.valueOf(c)));
            }
            else if (c == '[') {
            }
            i++;
        }
        return outBuilder.toString();
    }
    public String decodeExpression(String s) {
        return "";
    }
}
