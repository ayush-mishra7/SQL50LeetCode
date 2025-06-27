class NumArray {
    int[] suffix;
    public NumArray(int[] nums) {
        int n=nums.length;
        suffix=new int[n];
        suffix[n-1]=nums[n-1];

        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int n=suffix.length;
        return suffix[left]-(right+1<n?suffix[right+1]:0);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */