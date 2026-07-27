class Solution {
    public int maxProduct(int[] nums) {
        int min1=Integer.MIN_VALUE;
        int min2=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>min1){
                min2=min1;
                min1=num;
            }else if(num>min2){
                min2=num;
            }
        }
        return (min1-1)*(min2-1);
    }
}