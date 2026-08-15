class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(String ch:operations){
            if(ch.equals("C")){
                st.pop();
            }else if(ch.equals("D")){
                st.push(st.peek()*2);
            }else if(ch.equals("+")){
                int last=st.pop();
                int se=st.peek();
                st.push(last);
                st.push(last+se);
            }else{
                st.push(Integer.parseInt(ch));
            }
        }
        int sum=0;
        for(int sc:st){
            sum+=sc;
        }
        return sum;
    }
}