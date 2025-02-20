//  To find the sum of the diagonals of a 2D array
public class diagonalSum {
    public static void main(String[] args) {
        //int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] arr={{0,1,2},{3,4,5},{6,7,8}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[1].length;j++){
                if((i==j)||(i+j==arr.length-1)){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
