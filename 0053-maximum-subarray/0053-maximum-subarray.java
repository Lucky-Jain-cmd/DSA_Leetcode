class Solution {
    public int maxSubArray(int[] nums) {
      int sum = nums[0];
        int maxi = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either continue the subarray or start fresh from current element
            sum = Math.max(nums[i], sum + nums[i]);
            maxi = Math.max(maxi, sum);
        }

        return maxi;
    }
}