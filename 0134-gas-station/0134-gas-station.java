class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start=0;
        int total=0;
        int curr=0;
        for(int i=0;i<gas.length;i++){
            int fuel=gas[i]-cost[i];
            total+=fuel;
            curr+=fuel;
            if(curr<0){
                curr=0;
                start=i+1;
            }
        }
        return total<0?-1:start;
    }
}