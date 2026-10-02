class Solution {
    public void func(List<String> list,char[] ch,int ind,int open,int close){
        if(close==0 && open==0){
            list.add(new String(ch));
            return;
        }
        if(open>0){
            ch[ind]='(';
            func(list,ch,ind+1,open-1,close);
        }
        if(close>0 && close>open){
            ch[ind]=')';
            func(list,ch,ind+1,open,close-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        char[] ch=new char[2*n];
        func(list,ch,0,n,n);
        return list;
    }
}