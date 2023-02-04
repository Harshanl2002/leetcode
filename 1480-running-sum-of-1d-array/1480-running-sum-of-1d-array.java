class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length,arr[]=new int[n],sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
            arr[i]=sum;
        }
        return arr;
        
    }
}