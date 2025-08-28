package Strings;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeString {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            // Find the separator '#'
            int j = s.indexOf('#', i);
            int length = Integer.parseInt(s.substring(i, j)); // length of the string
            i = j + 1; // move past '#'
            res.add(s.substring(i, i + length));
            i += length;
        }
        return res;
    }
}
