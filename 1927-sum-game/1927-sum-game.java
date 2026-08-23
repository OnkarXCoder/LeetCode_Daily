class Solution {
    public boolean sumGame(String num) {
        int ld=0;
        int rd=0;
        int lq=0;
        int rq=0;
        int half=num.length()/2;
        for(int i=0;i<half;i++){
            if(num.charAt(i)=='?'){
                lq++;
                continue;
            }
            ld+=num.charAt(i)-'0';
        }
        for(int i=half;i<num.length();i++){
            if(num.charAt(i)=='?'){
                rq++;
                continue;
            }
            rd+=num.charAt(i)-'0';
        }
        int diff=ld-rd;
        return diff*2!=-9*(lq-rq);
    }
}