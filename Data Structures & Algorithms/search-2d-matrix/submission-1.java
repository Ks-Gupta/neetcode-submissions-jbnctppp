class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int s = 0;
        int e = rows*cols - 1;

        while(s <= e){
            int m = s + (e - s) / 2;
            int row = m/cols , col = m % cols;
            if(matrix[row][col] == target){
                return true;
            }else if(matrix[row][col] < target){
                s = m + 1;
            }else{
                e = m - 1;
            }
        }

        return false;
    }
}
