class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] ans=new boolean[201];
        for(int el:nums){
            ans[el]=true;
        }
        int ta=k;
        while(ans[ta]){
            ta+=k;
        }
        return ta;
    }
}