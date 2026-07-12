class Solution {
    public int numberOfSteps(int num) {
        return helper(num,0);
    }
    private int helper(int nums,int step){
        if(nums==0){
            return step;
        }
        if(nums%2==0){
            return helper(nums/2,step+1);
        }
        return helper(nums-1,step+1);
    }
}