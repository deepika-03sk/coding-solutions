class Solution {
    public int minMergedInteger(int[] nums) {
        int min= Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i+=2)
        {
            String s=nums[i] + "" +  nums[i+1];
            int value=Integer.parseInt(s);
            if(value<min)
            {
                min=value;
            }
        }
        return min;
    }
}