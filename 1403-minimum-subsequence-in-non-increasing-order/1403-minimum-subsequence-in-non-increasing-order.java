class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int total=0;
        for(int num:nums){
            total+=num;
        }
        List<Integer> ls=new ArrayList<>();
        int selected=0;
        for(int i=nums.length-1;i>=0;i--){
            selected+=nums[i];
            ls.add(nums[i]);
            int remain=total-selected;
            if(selected>remain){
                break;
            }
        }
        return ls;
    }
}