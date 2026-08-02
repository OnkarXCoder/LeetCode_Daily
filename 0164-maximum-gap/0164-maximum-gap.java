class Solution {
    public int maximumGap(int[] nums) {
        if(nums==null || nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        int maxg=0;
        for(int i=1;i<nums.length;i++){
            maxg=Math.max(maxg,nums[i]-nums[i-1]);
        }
        return maxg;
    }
}