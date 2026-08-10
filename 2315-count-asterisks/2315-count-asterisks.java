class Solution {
    public int countAsterisks(String s) {
        int res=0;
        boolean ins=false;
        for(char ch:s.toCharArray()){
            if(ch=='|'){
                ins=!ins;
            }
            else if(ch=='*' && !ins){
                res++;
            }
        }
        return res;
    }
}