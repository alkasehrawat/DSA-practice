//Print the number of 7’s that are inthe 2d array.
public class printNoOf7inArr {
    public static void main(String[] args) {
        int arr[][]={{4,7,8},{8,8,7} };
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==7){
                    count++;
                }
            }
        }
        System.out.println("The number of 7's in the array is: "+count);
    }
}
