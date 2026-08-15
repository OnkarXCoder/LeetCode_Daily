class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        int dsum=0;
        for(int num:nums){
            while(num!=0){
                int rem=num%10;
                dsum+=rem;
                num/=10;
            }
        }
        return sum-dsum;
    }
}