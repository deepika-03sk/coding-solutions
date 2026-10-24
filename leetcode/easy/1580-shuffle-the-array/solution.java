class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a=new int[2*n];
        int ind=0;
        for(int i=0;i<n;i++)
        {
            a[ind++]=nums[i];
            a[ind++]=nums[i+n];
        }
        return a;
    }
}