import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int tallestBillboard(int[] rods) {
        int total = 0;
        for (int rod : rods) {
            total += rod;
        }
        int[] dp = new int[total + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int rod : rods) {
            int[] curr = dp.clone();
            for (int i = 0; i <= total - rod; i++) {
                if (dp[i] < 0) continue;
                int sum = dp[i] + rod;
                curr[i + rod] = Math.max(curr[i + rod], sum);
                curr[Math.abs(i - rod)] = Math.max(curr[Math.abs(i - rod)], sum);
            }
            dp = curr;
        }

        return dp[0] == 0 ? 0 : dp[0] / 2;
    }
}

