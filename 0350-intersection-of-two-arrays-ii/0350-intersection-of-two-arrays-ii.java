class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       int i=0;
       int j=0;
       List<Integer> ls=new ArrayList<>();
       while(i<nums1.length && j<nums2.length){
        if(nums1[i]==nums2[j]){
            ls.add(nums1[i]);
            i++;
            j++;
        }else if(nums1[i]<nums2[j]){
            i++;
        }else{
            j++;
        }
       } 
       int[] ans=new int[ls.size()];
       for(int p=0;p<ls.size();p++){
        ans[p]=ls.get(p);
       }
       return ans;
    }
}