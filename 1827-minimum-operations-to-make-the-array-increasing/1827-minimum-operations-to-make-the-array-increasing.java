class Solution {
    public int minOperations(int[] nums) {
        int opera=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int increment=nums[i-1]+1-nums[i];
                opera+=increment;
                nums[i]=nums[i-1]+1;
            }
        }
        return opera;
    }
}