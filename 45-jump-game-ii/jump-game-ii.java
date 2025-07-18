class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[n-1] = 0;

        for(int start = n-2; start>=0; --start){
            int maxStepsAllowed = nums[start];
            int minSteps = Integer.MAX_VALUE;
            for(int jump = 1; jump<=maxStepsAllowed && jump+start<n; ++jump){
                minSteps = Math.min(minSteps, dp[start+jump]);
            }
            if(minSteps == Integer.MAX_VALUE){
                dp[start] = Integer.MAX_VALUE;
            }
            else{
                dp[start] = minSteps+1;
            }
        }
        return dp[0];
    }
}