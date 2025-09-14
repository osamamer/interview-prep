package DynamicProgramming;

public class DecodeWays {
    public int numDecodings(String s) {
        // the crux of this question is: if a digit is valid on its own, then to its dp entry I add dp[i + 1]
        // If a digit is valid with the one after it, I also add dp[i + 2]. This doesn't break anything.
        // If two digits work, but there is no way to decode starting from i + 2, then dp[i + 2] will be zero and zero will be added to dp[i].
        // dp[i] represents how many ways I can decode the substring starting from i till the end.
        // And notice that it's not if-else, it's if if.
        int[] dp = new int[s.length() + 1];
        dp[dp.length - 1] = 1; // 1 way to decode an empty string
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '0') {
                dp[i] += dp[i + 1];
            }
            if (i + 2 < dp.length) {
                int pair = Integer.parseInt(s.substring(i, i + 2));
                if (pair >= 10 && pair <= 26) {
                    dp[i] += dp[i + 2];
                }
            }
        }
        return dp[0];
    }
}