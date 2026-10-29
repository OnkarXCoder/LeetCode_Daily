class Solution {
    public int[] fairCandySwap(int[] alice, int[] bob) {
        int sum1=0,sum2=0;
        for(int a:alice) sum1+=a;
        for(int b:bob) sum2+=b;
        int diff=(sum2-sum1)/2;
        Set<Integer> setb=new HashSet<>();
        for(int b:bob) setb.add(b);
        for(int a:alice){
            if(setb.contains(a+diff)){
                return new int[]{a,a+diff};
            }
        }
        return new int[] {};
    }
}