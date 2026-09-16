class Solution {
    public int[][] cyclicShift(int n, int[][] gr, int[] rshift, int[] cshift) {
        int ans[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int anscol=(j-rshift[i]+n)%n;
                int ansrow=(i-cshift[anscol]+n)%n;
                ans[ansrow][anscol]=gr[i][j];
            }
        }
        return ans;
    }
}