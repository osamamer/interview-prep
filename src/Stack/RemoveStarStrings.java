package Stack;

import java.util.Stack;

public class RemoveStarStrings { // First try ez pz
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != '*') {
                stack.push(c);
            }
            else {
                stack.pop();
            }
        }
        for (Character c : stack) {
            builder.append(c);
        }
        return builder.toString();
    }
}
