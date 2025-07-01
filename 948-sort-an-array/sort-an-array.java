class Solution {
    public int[] sortArray(int[] nums) {
        divide(nums, 0 , nums.length -1);
        
        return nums;

        
    }
    public void divide(int nums[] ,int start , int end) {
        if (start >= end ) {
            return;
        }
        int mid = start + (end - start)/2;

        divide(nums, start, mid);
        divide(nums, mid+1, end);

        merge(nums, start, mid , end);
    }
    public void merge(int nums[], int start , int mid, int end) {
        int [] merged = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while(j <= end && i<= mid) {
            if (nums[i] <= nums[j]) {
                merged[k] = nums[i];
                i++;
                k++;
            }
            else {
                merged[k] = nums[j];
                j++;
                k++;
            }
        }
        while (i<=mid) {
            merged[k] = nums[i];
            i++;
            k++;
        }
        while (j<= end) {
            merged[k] = nums[j];
            j++;
            k++;
        }
        for (int b = 0; b< merged.length; b++) {
            nums[start + b] = merged[b];

        }
    }


}