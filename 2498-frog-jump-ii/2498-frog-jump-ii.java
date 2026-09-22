class Solution {
    public int maxJump(int[] stones) {
        int res=0;
        if(stones.length==2){
            res=stones[1]-stones[0];
        }
        for(int i=0;i<stones.length-2;i++){
            res=Math.max(res,stones[i+2]-stones[i]);
        }
        return res;
    }
}