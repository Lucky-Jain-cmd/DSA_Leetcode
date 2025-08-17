class Solution {
    public double new21Game(int n, int k, int maxPts) {
          // If k == 0, Alice does not draw any card → score always remains 0
        // which is always <= n  → probability = 1
        if (k == 0) return 1.0;
         // If k == 1, Alice draws exactly one number from [1..maxPts]
        // Final score will be <= n only if that number <= n
        if (k == 1) {
            return (double)Math.min(n, maxPts) / (double)maxPts;
        }
        // Array to store probability of reaching exactly 'i' points
        double[] prob = new double[n + 1];

        // Alice starts at 0 points with probability 1
        prob[0] = 1.0;

        // windowSum keeps track of sum of probabilities of the last 'maxPts' positions
        double windowSum = 1.0;

        for (int i = 1; i <= n; i++) {

            // The probability of reaching 'i' is the average of the previous 'maxPts' probabilities
            prob[i] = windowSum / maxPts;

            // If i < k, it means Alice will continue drawing from this state,
            // so we include prob[i] in the windowSum for future positions
            if (i < k) {
                windowSum += prob[i];
            }

            // Remove the probability that falls out of the sliding window
            if (i - maxPts >= 0) {
                windowSum -= prob[i - maxPts];
            }
        }

        // Now all positions >= k are final stopping points.
        // Sum up the probabilities of all final scores in the range [k…n]
        double ans = 0.0;
        for (int i = k; i <= n; i++) {
            ans += prob[i];
        }

        return ans;
    }
}