class Solution {
    public void sortColors(int[] nums) {
        int red=0;
        int white=0;
        int black=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
            red++;
            else if(nums[i]==1)
            white++;
            else
            black++;
        }
        int index=0;
        while(red>0){
            nums[index]=0;
            index++;
            red--;
        }
        while(white>0){
            nums[index]=1;
            index++;
            white--;
        }
        while(black>0)
        {
            nums[index]=2;
            index++;
            black--;
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]);
        }
    }
}