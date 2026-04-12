class Solution {

    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word = null; // store word at end
    }

    public List<String> findWords(char[][] board, String[] words) {

        TrieNode root = buildTrie(words);
        List<String> res = new ArrayList<>();

        int rows = board.length;
        int cols = board[0].length;

        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                dfs(board, r, c, root, res);
            }
        }

        return res;
    }

    private void dfs(char[][] board, int r, int c,
                     TrieNode node, List<String> res){

        if(r < 0 || c < 0 || r >= board.length || c >= board[0].length)
            return;

        char ch = board[r][c];

        if(ch == '#' || node.children[ch - 'a'] == null)
            return;

        node = node.children[ch - 'a'];

        // found word
        if(node.word != null){
            res.add(node.word);
            node.word = null; // avoid duplicates
        }

        board[r][c] = '#';

        dfs(board, r+1, c, node, res);
        dfs(board, r-1, c, node, res);
        dfs(board, r, c+1, node, res);
        dfs(board, r, c-1, node, res);

        board[r][c] = ch;
    }

    private TrieNode buildTrie(String[] words){

        TrieNode root = new TrieNode();

        for(String word : words){

            TrieNode node = root;

            for(char c : word.toCharArray()){

                int idx = c - 'a';

                if(node.children[idx] == null){
                    node.children[idx] = new TrieNode();
                }

                node = node.children[idx];
            }

            node.word = word;
        }

        return root;
    }
}

