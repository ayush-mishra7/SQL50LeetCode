class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        int idx=0;
        for(int i=0;i<n;i++){
            idx=idx^nums[i];
        }
        return idx;
    }
}