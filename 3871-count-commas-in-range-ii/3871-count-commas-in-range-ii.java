class Solution {
    public long countCommas(long n) {
        long start=1000;
        long comm=1;
        long ans=0;
        while(start<=n){
            long end=(start>n/1000)?n:start*1000-1;
            long count=end-start+1;
            ans+=count*comm;
            start*=1000;
            ++comm;
        }
        return ans;
    }
}