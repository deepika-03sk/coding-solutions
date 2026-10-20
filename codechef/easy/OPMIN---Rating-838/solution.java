class Solution {
    public int countNonMinimum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int minVal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minVal) {
                minVal = nums[i];
            }
        }
        
        int countMin = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == minVal) {
                countMin++;
            }
        }
        
        return nums.length - countMin;
    }
}