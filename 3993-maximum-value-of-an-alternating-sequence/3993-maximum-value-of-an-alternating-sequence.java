class Solution {
    public long maximumValue(int n, int s, int m) {
        long option1=(long)s+(long)((n-1)/2)*(m-1);
        long option2=s;
        if(n>=2){
            option2 = (long) s + 1L + (long) (n / 2) * (m - 1);
        }
        return Math.max(option1,option2);
    }
}