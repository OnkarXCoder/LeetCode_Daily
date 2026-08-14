class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[26];
        int left=0;
        int maxlen=0;
        for(int ri=0;ri<s.length();ri++){
            freq[s.charAt(ri)-'a']++;
            while(freq[s.charAt(ri)-'a']>2){
                freq[s.charAt(left)-'a']--;
                left++;
            }
            maxlen=Math.max(maxlen,ri-left+1);
        }
        return maxlen;
    }
}