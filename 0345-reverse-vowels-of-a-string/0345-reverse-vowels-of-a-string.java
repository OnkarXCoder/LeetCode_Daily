class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        int left=0,rigth=arr.length-1;
        while(left<rigth){
            while(left<rigth && !isVowel(arr[left])){
                left++;
            }
            while(left<rigth && !isVowel(arr[rigth])){
                rigth--;
            }
            char temp=arr[left];
            arr[left]=arr[rigth];
            arr[rigth]=temp;
            left++;
            rigth--;
        }
        return new String(arr);
    }
    private boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}