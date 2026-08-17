class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int maxAns=Integer.MIN_VALUE;
        int maxLight=Integer.MIN_VALUE;
        for(int num:lights){
            maxLight=Math.max(maxLight,num);
        }
        for(int ar:arrivalTime){
            int curr=ar%period;
            if(curr>=maxLight){
                maxAns=Math.max(maxAns,period-curr);
            }
        }
        return maxAns==Integer.MIN_VALUE?0:maxAns;
    }
}