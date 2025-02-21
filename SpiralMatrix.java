//spiral matrix is a matrix in which the elements are arranged in a spiral order
public class spiralMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 15, 16, 6}, {10, 9, 8, 7}};
        int strtR = 0;
        int endR = matrix.length - 1;
        int strtC = 0;
        int endC = matrix[0].length - 1;
        // j for col, i for row
        while (strtR <= endR && strtC <= endC) {
            // first row
            for (int j = strtC; j <= endC; j++) {
                System.out.print(matrix[strtR][j] + " ");
            }
            strtR++;
            // last col
            for (int i = strtR; i <= endR; i++) {
                System.out.print(matrix[i][endC] + " ");
            }
            endC--;
            // last row
            if (strtR <= endR) {
                for (int j = endC; j >= strtC; j--) {
                    System.out.print(matrix[endR][j] + " ");
                }
                endR--;
            }
            // first col
            if (strtC <= endC) {
                for (int i = endR; i >= strtR; i--) {
                    System.out.print(matrix[i][strtC] + " ");
                }
                strtC++;
            }
        }
    }
}
