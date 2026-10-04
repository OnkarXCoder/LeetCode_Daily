class Solution {
    public int findCenter(int[][] e1) {
        return e1[0][0]==e1[1][0] || e1[0][0]==e1[1][1]?e1[0][0]:e1[0][1];
    }
}