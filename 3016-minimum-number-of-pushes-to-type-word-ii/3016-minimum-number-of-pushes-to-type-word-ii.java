class Solution {
    public int minimumPushes(String word) {
        int[] ch=new int[26];
        for(char c:word.toCharArray()){
            ch[c-'a']++;
        }
        Arrays.sort(ch);
        int ans=0;
        for(int i=25;i>=0 && ch[i]>0;i--){
            ans+=ch[i]*((25-i)/8+1);
        }
        return ans;
    }
}