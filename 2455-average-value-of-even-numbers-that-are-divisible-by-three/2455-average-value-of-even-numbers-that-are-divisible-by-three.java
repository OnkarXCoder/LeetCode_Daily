class Solution {
    public int averageValue(int[] nums) {
        int res=0;
        int amount=0;
        for(int c:nums){
            if(c%6==0){
                res+=c;
                amount++;
            }
        }
        if(amount==0) return 0;
        return res/amount;
    }
}