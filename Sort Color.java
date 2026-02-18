class Solution {
    public void sortColors(int[] nums) {
        int i=0,j=0,temp=0;
        int l=nums.length;
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(nums[i]>nums[j])
                {temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;}
            }
        }
    }
}
