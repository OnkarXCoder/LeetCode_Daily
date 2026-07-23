class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> da=new HashSet<>();
        for(int fr:friends){
            da.add(fr);
        }
        int[] ans=new int[friends.length];
        int idx=0;
        for(int s:order){
            if(da.contains(s)){
                ans[idx++]=s;
            }
        }
        return ans;
    }
}