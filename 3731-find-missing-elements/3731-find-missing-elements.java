class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int mn=Integer.MAX_VALUE,mx=Integer.MIN_VALUE;
        Set<Integer> set=new HashSet<>(); 
        for(int n:nums){
            mn=Math.min(mn,n);
            mx=Math.max(mx,n);
            set.add(n);
        }
        List<Integer> ans=new ArrayList<>();
        for(int x=mn+1;x<mx;x++){
            if(!set.contains(x)){   ans.add(x);}
        }
        return ans;
    }
}