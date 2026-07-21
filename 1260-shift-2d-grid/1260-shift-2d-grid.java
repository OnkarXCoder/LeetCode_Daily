class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int total=m*n;
        k%=total;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(0);
            }
            ans.add(row);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int index=i*n+j;
                int newi=(index+k)%total;
                int newrow=newi/n;
                int newcol=newi%n;
                ans.get(newrow).set(newcol,grid[i][j]);
            }
        }
        return ans;
    }
}