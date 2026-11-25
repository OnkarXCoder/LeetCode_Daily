class Solution {
    public int minRange(int a, int b, int c) {
        int min=Math.min(a,Math.min(b,c));
        int max=Math.max(a,Math.max(b,c));
        if(max==a){
            if(b+c<a) a=b+c;
        }else if(max==b){
            if(a+c<b) b=a+c;
        }else{
            if(a+b<c) c=a+b;
        }
        min=Math.min(a,Math.min(b,c));
        max=Math.max(a,Math.max(b,c));
        return max-min;
    }
}