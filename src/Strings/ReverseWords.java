package Strings;

public class ReverseWords {
    public String reverseWords(String s) {
        String [] arr = s.trim().split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            stringBuilder.append(arr[i]);
            if (i != 0) {
                stringBuilder.append(' ');
            }
        }
        return stringBuilder.toString();
    }
}
