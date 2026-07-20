class Solution {
    public boolean checkString(String s) {
       boolean seenb=false;
       for(char ch:s.toCharArray()){
        if(ch=='b'){
            seenb=true;
        }else if(seenb){
            return false;
        }
       } 
       return true;
    }
}