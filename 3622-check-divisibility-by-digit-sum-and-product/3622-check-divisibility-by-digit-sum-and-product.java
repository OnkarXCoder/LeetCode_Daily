class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pro=1;
        int no=n;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            pro*=rem;
            n=n/10;
        }
       return no%(sum+pro)==0;
    }
}