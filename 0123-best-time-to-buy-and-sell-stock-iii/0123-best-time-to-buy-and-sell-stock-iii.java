class Solution {
    public int maxProfit(int[] prices) {
        int b1=-prices[0];
        int s1=0;
        int b2=-prices[0];
        int s2=0;
        for(int i=1;i<prices.length;i++){
            int pi=prices[i];
            b1=Math.max(b1,-pi);
            s1=Math.max(s1,b1+pi);
            b2=Math.max(b2,s1-pi);
            s2=Math.max(s2,b2+pi);
        }
        return s2;
    }
}