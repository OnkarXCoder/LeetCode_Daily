class Solution {
    public int numberOfAlternatingGroups(int[] col) {
        int groups=0;
        int n=col.length;
        for(int i=1;i<n-1;i++){
            if(col[i-1]!=col[i] && col[i+1]!=col[i]) groups++;
        }
        if(col[n-1] != col[n-2] && col[n-1] != col[0]) groups++;
        if(col[0] != col[1] && col[0] != col[n-1]) groups++;
        return groups;
    }
}