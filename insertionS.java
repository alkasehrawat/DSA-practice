public class insertionS {
    //to print sorted array
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //insertion sort
    public static void insertS(int[] arr){
        for(int i=1;i<arr.length;i++){
            int curr=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
    }
    public static void main(String[] args) {
        int[] arr={4,8,2,6,0,1,5,7,3};
        insertS(arr);
        printArr(arr);
    }
}
