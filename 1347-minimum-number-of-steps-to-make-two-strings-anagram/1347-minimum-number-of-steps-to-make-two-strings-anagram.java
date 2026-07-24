class Solution {
    public int minSteps(String s, String t) {
        int[] freq=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        int ans=0;
        for(int x:freq){
            if(x>0){
                ans+=x;
            }
        }
        return ans;
    }
}