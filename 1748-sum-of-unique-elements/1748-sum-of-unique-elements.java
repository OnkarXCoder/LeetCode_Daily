class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        int[] res=new int[101];
        for(int n:nums){
            res[n]++;
        }
        for(int i=0;i<res.length;i++){
            if(res[i]==1){
                sum+=i;
            }
        }
        return sum;
    }
}