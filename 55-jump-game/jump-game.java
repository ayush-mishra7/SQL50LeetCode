class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n];
        dp[n - 1] = true;
        for (int startIdx = n-2; startIdx>=0; --startIdx) {
            int maxjumps = nums[startIdx];
            boolean isPossible = false;

            for (int jump =1; jump <= maxjumps; jump++) {
               if(dp[startIdx + jump]== true){
                isPossible = true;
                break;
               } 
            }
            dp[startIdx] = isPossible;        
        }
        return dp[0];
}
}