class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        boolean[] nu1=new boolean[101];
        boolean[] nu2=new boolean[101];
        for(int nums:nums1){
            nu1[nums]=true;
        }
        for(int num:nums2){
            nu2[num]=true;
        }
        int ans1=0;
        int ans2=0;
        for(int num:nums1){
            if(nu2[num]){
                ans1++;
            }
        }
        for(int num:nums2){
            if(nu1[num]){
                ans2++;
            }
        }
        int[] arr={ans1,ans2};
        return arr;
    }
}