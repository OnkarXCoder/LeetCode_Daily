class Solution {
    public int maximumCount(int[] nums) {
        int nres=0;
        int pres=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nres++;
            }else if(nums[i]>=1 && nums[i]!=0){
                pres++;
            }
        }
        return Math.max(nres,pres);
    }
}