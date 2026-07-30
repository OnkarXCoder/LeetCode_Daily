class Solution {
    public String sortVowels(String s) {
        List<Character> ls=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(isVowel(ch)){
                ls.add(ch);
            }
        }
        Collections.sort(ls);
        StringBuilder ans=new StringBuilder();
        int idx=0;
        for(char ch:s.toCharArray()){
            if(isVowel(ch)){
                ans.append(ls.get(idx++));
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
    private Boolean isVowel(char ch){
        return ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U';
    }
}