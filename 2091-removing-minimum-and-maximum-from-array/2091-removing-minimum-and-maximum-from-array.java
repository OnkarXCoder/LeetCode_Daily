class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int min=0;
        int max=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[min]){
                min=i;
            }
             if(nums[i]>nums[max]){
                max=i;
            }
        }
        int remove=Math.max(min,max)+1;
        int removeB=n-Math.min(min,max);
        int removeF=Math.min(min+1+(n-max),max+1+(n-min));
        return Math.min(remove,Math.min(removeB,removeF));
    }
}