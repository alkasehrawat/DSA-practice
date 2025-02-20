//if value occurs twice in array return true else false
public class checkValOccurTwice {
    public static boolean checkTwi(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,2,8};
        System.out.println(checkTwi(arr));
    }
}
