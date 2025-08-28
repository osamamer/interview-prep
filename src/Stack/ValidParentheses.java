package Stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> openStack = new Stack<>();
        Stack<Character> closedStack = new Stack<>();
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('(', ')');
        hashMap.put('{', '}');
        hashMap.put('[', ']');


        if (s.length() == 1)
            return false;
        if (!hashMap.containsKey(s.charAt(0)))
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                openStack.push(s.charAt(i));
            } else {
                closedStack.push(s.charAt(i));
            }
            if (openStack.isEmpty() && !closedStack.isEmpty())
                return false;
            if (!closedStack.isEmpty() && !openStack.isEmpty())
                if (hashMap.get(openStack.pop()) != closedStack.pop()) {
                    return false;
                }
        }
        return openStack.isEmpty() && closedStack.isEmpty();
    }

    public static boolean isValid2(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('(', ')');
        hashMap.put('{', '}');
        hashMap.put('[', ']');


        if (s.length() == 1)
            return false;
        if (!hashMap.containsKey(s.charAt(0)))
            return false;
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) { // if it's an opening bracket
                stack.push(s.charAt(i));
            }
            else { // if it's a closing bracket
                if (stack.isEmpty())
                    return false;
                if (hashMap.get(stack.peek()) != s.charAt(i))
                    return false;
                else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}