class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq=new int[26];
        for(char task:tasks){
            freq[task-'A']++;
        }
        int maxf=0;
        for(int count:freq){
            maxf=Math.max(maxf,count);
        }
        int maxt=0;
        for(int count:freq){
            if(count==maxf){
                maxt++;
            }
        }
        int s=(maxf-1)*(n+1)+maxt;
        return Math.max(tasks.length,s);
    }
}