class Solution {
    public int trap(int[] height) {
        int[] left=maxToleft(height);
        int[] right=maxToright(height);
        int total=0;
        for(int i=0;i<height.length;i++){
            total+=Math.min(left[i],right[i])-height[i];
        }
        return total;
    }
    public int[] maxToleft(int[] height){
        int[] left=new int[height.length];
        int max=0;
        for(int i=0;i<height.length;i++){
            max=Math.max(max,height[i]);
            left[i]=max;
        }
        return left;
    }
    public int[] maxToright(int[] height){
        int[] right=new int[height.length];
        int max=0;
        for(int i=height.length-1;i>=0;i--){
            max=Math.max(max,height[i]);
            right[i]=max;
        }
        return right;
    } 
}