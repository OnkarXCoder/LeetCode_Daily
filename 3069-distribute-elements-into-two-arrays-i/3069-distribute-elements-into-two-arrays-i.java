class Solution {
    public int[] resultArray(int[] nums) {
        List<Integer> ls1=new ArrayList<>();
        List<Integer> ls2=new ArrayList<>();
        ls1.add(nums[0]);
        ls2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            int last1=ls1.get(ls1.size()-1);
            int last2=ls2.get(ls2.size()-1);
            if(last1>last2) ls1.add(nums[i]);
            else ls2.add(nums[i]);
        }
        int[] res=new int[nums.length];
        int idx=0;
        for(int x:ls1) res[idx++]=x;
        for(int x:ls2) res[idx++]=x;
        return res;
    }
}