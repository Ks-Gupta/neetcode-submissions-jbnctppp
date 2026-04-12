class PrefixTree {

    class TrieNode {
        TrieNode[] children;
        boolean isEnd;

        TrieNode() {
            children = new TrieNode[26];
            isEnd = false;
        }
    }

    private TrieNode root;

    public PrefixTree() {
        root = new TrieNode();
    }

    // INSERT
    public void insert(String word) {

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

    // SEARCH
    public boolean search(String word) {

        TrieNode node = root;

        for(char c : word.toCharArray()){

            int idx = c - 'a';

            if(node.children[idx] == null){
                return false;
            }

            node = node.children[idx];
        }

        return node.isEnd;
    }

    // PREFIX
    public boolean startsWith(String prefix) {

        TrieNode node = root;

        for(char c : prefix.toCharArray()){

            int idx = c - 'a';

            if(node.children[idx] == null){
                return false;
            }

            node = node.children[idx];
        }

        return true;
    }
}
