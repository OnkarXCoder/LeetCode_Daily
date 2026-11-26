class Solution {
    public boolean canAliceWin(int n) {
        int mo=10;
        int turn=0;
        while(n>=mo){
            n-=mo;
            mo--;
            turn++;
        }
        return turn%2==1;
    }
}