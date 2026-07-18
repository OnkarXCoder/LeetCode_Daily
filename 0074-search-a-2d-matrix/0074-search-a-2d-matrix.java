class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int rows=matrix.length;
     int col=matrix[0].length;
     int low=0;
     int high=rows*col-1;
     while(low<=high){
        int mid=low+(high-low)/2;
        int row=mid/col;
        int cols=mid%col;
        if(matrix[row][cols]==target){
            return true;
        }else if(matrix[row][cols]<target){
            low=low+1;
        }
        else{
            high=high-1;
        }
     }   
     return false;
    }
}