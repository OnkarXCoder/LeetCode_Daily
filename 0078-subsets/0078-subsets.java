class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();
        getSubsets(stk,0,nums,ls);
        return ls;
    }
    public void getSubsets(Stack<Integer> stk,int start,int[] nums,List<List<Integer>> subsets){
        subsets.add(new ArrayList<>(stk));
        for(int i=start;i<nums.length;i++){
            stk.push(nums[i]);
            getSubsets(stk,i+1,nums,subsets);
            stk.pop();
        }
        return;
    }
}