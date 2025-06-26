class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int maxSubArrSum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            maxSubArrSum=Math.max(maxSubArrSum, sum);
            if(sum<0){
                sum=0;
            }
        }return maxSubArrSum;
    }
}