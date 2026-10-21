class TrieNode {
    TrieNode root;
    public char val;
    public boolean isWord;
    public TrieNode[] children=new TrieNode[26];
    public TrieNode(){}
    public TrieNode(char c) {
         val=c;
    }
}
class Trie{
    private TrieNode r1;
    public Trie(){
        r1=new TrieNode();
        r1.val=' ';
    }
    public void insert(String word) {
       TrieNode ws=r1;
       for(int i=0;i<word.length();i++){
          char c=word.charAt(i);
          if(ws.children[c-'a']==null){
            ws.children[c-'a']=new TrieNode(c);
          }
          ws=ws.children[c-'a'];
       }
       ws.isWord=true;
    }
    
    public boolean search(String word) {
        TrieNode s1=r1;
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(s1.children[c-'a']==null) return false;
            s1=s1.children[c-'a'];
        }
        return s1.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode w1=r1;
        for(int i=0;i<prefix.length();i++){
            char c = prefix.charAt(i);
            if(w1.children[c - 'a'] == null) return false;
            w1 = w1.children[c - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */