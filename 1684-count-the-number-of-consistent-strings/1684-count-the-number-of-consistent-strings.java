class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> hs=new HashSet<>();
        for(char ch:allowed.toCharArray()){
            hs.add(ch);
        }
        int count=0;
        for(String word:words){
            boolean valid=true;
            for(char ch:word.toCharArray()){
                if(!hs.contains(ch)){
                    valid=false;
                    break;
                }
            }
            if(valid==true){
                count++;
            }
        }
        return count;
    }
}