class Solution {
    public int minRange(int a, int b, int c) {
        int arr[] ={a,b,c};
        Arrays.sort(arr);
        return Math.min(arr[2]-arr[0],arr[1]);
    }
}