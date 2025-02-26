//leetcode-73
class Solution {
    public void setZeroes(int[][] matrix) {
       int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] rowFlags = new boolean[rows];
        boolean[] colFlags = new boolean[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowFlags[i] = true;
                    colFlags[j] = true;
                }
            }
        }

        // Step 2: Set marked rows to zero
        for (int i = 0; i < rows; i++) {
            if (rowFlags[i]) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Set marked columns to zero
        for (int j = 0; j < cols; j++) {
            if (colFlags[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
