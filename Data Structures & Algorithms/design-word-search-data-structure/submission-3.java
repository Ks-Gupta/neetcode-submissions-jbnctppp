class WordDictionary {

    public class TrieNode{
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }

    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = root;
        for(char c : word.toCharArray()){
            int idx = c - 'a';
            if(node.children[idx] == null){
                node.children[idx] = new TrieNode();
            }
            node = node.children[idx];

        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int i, TrieNode node){
        if(node == null) return false;
        if(i == word.length()){
            return node.isEnd;
        }

        char c = word.charAt(i);
        if(c != '.'){
            int idx = c - 'a';
            return dfs(word, i + 1, node.children[idx]);
        }
        else{
            for(int k = 0; k < 26; k++){
                if(node.children[k] != null){
                    if(dfs(word, i + 1, node.children[k])) return true;
                }
            }
        }

        return false;
    }
}
