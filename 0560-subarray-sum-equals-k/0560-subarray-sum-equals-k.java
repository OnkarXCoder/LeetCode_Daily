class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int pre=0;
        hm.put(0,1);
        int nosub=0;
        for(int i=0;i<nums.length;i++){
            pre+=nums[i];
            int rem=pre-k;
            if(hm.containsKey(rem)){
                nosub+=hm.get(rem);
            }
            hm.put(pre,hm.getOrDefault(pre,0)+1);
        }
        return nosub;
    }
}