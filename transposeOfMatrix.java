//Transpose of a Matrix
public class transposeOfMatrix {
    public static void transP(int[][] matrix){
        //Transpose of a matrix
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[j][i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6}};
        transP(matrix);
    }
}
