class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder binary=new StringBuilder();
        for(char c:s.toCharArray()){
            int asc=(int)c;
            String bin = String.format("%8s", Integer.toBinaryString(asc)).replace(' ', '0');
            binary.append(bin);
        }
        int i=0;
        int j=binary.length()-1;
        while(i<j){
            if(binary.charAt(i)!=binary.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}