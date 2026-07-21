class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
         if(a[0]==b[0]){
            return b[1]-a[1];
         }else{
            return a[0]-b[0];
         }
    });
         int count=0;
         int maxEnd=0;
         for(int[] inter:intervals){
            if(inter[1]>maxEnd){
                count++;
                maxEnd=inter[1];
            }
         }
         return count;
    }
}