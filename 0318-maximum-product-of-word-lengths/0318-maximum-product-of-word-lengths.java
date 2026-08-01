class Solution {
    public int maxProduct(String[] words) {
        int n=words.length;
        int[] mask=new int[n];
        for(int i=0;i<n;i++){
            int bitM=0;
            for(char ch:words[i].toCharArray()){
                bitM|=(1<<(ch-'a'));
            }
            mask[i]=bitM;
        }
        int maxpro=0;
        for(int i=0;i<n;i++){
            for(int j=i+1; j<n;j++){
                if((mask[i] & mask[j])==0){
                maxpro=Math.max(maxpro,words[i].length()*words[j].length());
                }
            }

        }
        return maxpro;
    }
}