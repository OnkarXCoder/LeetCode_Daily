class Solution {
    public int smallestEqual(int[] nums) {
        int min=489;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i%10==nums[i]){
                min=Math.min(i,min);
            }
        }
        if(min==489) return -1;
        else return min;
    }
}