class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int row = 0; row < 9; row++){
            Set<Character> rowSet = new HashSet<>();
            for(int i = 0; i < 9; i++){
                char c = board[row][i];
                if(c == '.') continue;
                if(rowSet.contains(c)) return false;
                rowSet.add(c);
            }
        }

        for(int col = 0; col < 9; col++){
            Set<Character> colSet = new HashSet<>();
            for(int i = 0; i < 9; i++){
                char c = board[i][col];
                if(c == '.') continue;
                if(colSet.contains(c)) return false;
                colSet.add(c);
            }
        }

        for(int box = 0; box < 9; box++){
            Set<Character> boxSet = new HashSet<>();

            int row = (box/3) * 3;
            int col = (box % 3) * 3;

            for(int i = 0; i < 3; i++){
                for(int j = 0; j < 3; j++){
                    char c = board[row+i][col+j];

                    if(c == '.') continue;
                    if(boxSet.contains(c)) return false;
                    boxSet.add(c);
                }
            }
        }

        return true;
    }
}
