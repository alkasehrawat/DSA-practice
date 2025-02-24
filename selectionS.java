public class selectionS {
    //to print sorted array
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //selction sort
    public static void selectS(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={3,7,2,5,9,1};
        selectS(arr);
        printArr(arr);
    }
}
