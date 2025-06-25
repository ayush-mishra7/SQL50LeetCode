class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int left = -1;
        int right = -1;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                left=i;
                break;
            }
        }
        for(int i=n-1;i>=0;--i){
            if(nums[i]==target){
                right=i;
                break;
            }
        }
        return new int[]{left,right};
    }
}
