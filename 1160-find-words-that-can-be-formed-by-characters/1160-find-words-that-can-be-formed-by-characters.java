class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] count=new int[26];
        for(char c:chars.toCharArray()){
            count[c-'a']++;
        }
        int ans=0;
        for(String st:words){
            int[] temp=new int[26];
            for(char ch:st.toCharArray()){
                temp[ch-'a']++;
            }
            boolean poss=true;
            for(int i=0;i<26;i++){
                if(count[i]<temp[i]){
                    poss=false;
                    break;
                }
            }
            if(poss){
                ans+=st.length();
            }
        }
        return ans;
    }
}