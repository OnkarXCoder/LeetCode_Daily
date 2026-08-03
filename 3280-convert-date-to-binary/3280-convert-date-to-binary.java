class Solution {
    public String convertDateToBinary(String date) {
        String[] parts=date.split("-");
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<parts.length;i++){
            int nu=Integer.parseInt(parts[i]);
            ans.append(Integer.toBinaryString(nu));
            if(i<2){
                ans.append("-");
            }
        }
        return ans.toString();
    }
}