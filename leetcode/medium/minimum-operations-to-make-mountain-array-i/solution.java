class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        for(int peak=1;peak<n-1;peak++)
        {
            int c=0;
            for(int i=0;i<peak;i++)
            {
                int t=i+1;
                if(nums[i]!=t)
                {
                    c+=Math.abs(nums[i]-t);
                }
            }
            int max=nums[peak];
            for(int i=peak-1;i>=0;i--)
            {
                max=Math.min(max-1,nums[i]);
            }
        }
        return ans;
    }
}