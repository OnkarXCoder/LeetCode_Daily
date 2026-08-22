class Solution {
    public int rob(int[] nums) {
        int prev=0;
        int max=0;
        for(int curva:nums){
            int temp=Math.max(max,prev+curva);
            prev=max;
            max=temp;
        }
        return max;
    }
}