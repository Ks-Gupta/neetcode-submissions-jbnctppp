class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        Set<Integer> cols = new HashSet<>();
        Set<Integer> diag1 = new HashSet<>();
        Set<Integer> diag2 = new HashSet<>();

        char[][] board = new char[n][n];
        for(char[] row : board){
            Arrays.fill(row, '.');
        }

        bt(0, n, board, cols, diag1, diag2, res);
        return res;

    }

   private void bt(int row, int n, char[][] board, Set<Integer> cols, Set<Integer> diag1, Set<Integer> diag2, List<List<String>> res){
      
      if(row == n){
        List<String> temp = new ArrayList<>();
        for(char[] r : board){
            temp.add(new String(r));
        }
        res.add(temp);
        return;
      }

      for(int col = 0; col < n; col++){
        if(cols.contains(col) || diag1.contains(row - col) || diag2.contains(row +col)) continue;

        board[row][col] = 'Q';

        cols.add(col);
        diag1.add(row - col);
        diag2.add(row + col);

        bt(row + 1, n, board, cols, diag1, diag2, res);
        board[row][col] = '.';

        cols.remove(col);
        diag1.remove(row - col);
        diag2.remove(row + col); 
      }
   }
}
