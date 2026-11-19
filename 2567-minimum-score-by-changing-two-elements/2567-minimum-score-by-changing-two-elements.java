class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int o1=nums[n-1]-nums[2];
        int o2=nums[n-2]-nums[1];
        int o3=nums[n-3]-nums[0];
        return Math.min(o1,Math.min(o2,o3));
    }
}