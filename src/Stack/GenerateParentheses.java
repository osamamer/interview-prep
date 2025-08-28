package Stack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        generateParenthesis(3);
    }
    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }
    public static void backtrack(List<String> result, StringBuilder current, int open, int closed, int n) {
        if (current.length() == n * 2) {
            result.add(current.toString());
            return;
        }
        if (open < n) {
            current.append('(');
            backtrack(result, current, open + 1, closed, n);
            current.deleteCharAt(current.length() - 1);
        }
        if (closed < open) {
            current.append(')');
            backtrack(result, current, open, closed + 1, n);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
