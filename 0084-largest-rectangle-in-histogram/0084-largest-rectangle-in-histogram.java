class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int max=0;
        Deque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<=n;i++){
            int curr=(i==n)?0:heights[i];
            while(!stack.isEmpty() && curr<heights[stack.peek()]){
                int height=heights[stack.pop()];
                int width=stack.isEmpty()?i:i-stack.peek()-1;
                max=Math.max(max,height*width);
            }
            stack.push(i);
        }
        return max;
    }
}