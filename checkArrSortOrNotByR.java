public class checkArrSortOrNotByR {
    public static void checkArrSortOrNot(int[] arr,int i){
        if(i==arr.length-1){
            System.out.println("Array is sorted");
            return;
        }
        if(arr[i]>arr[i+1]){
            System.out.println("Array is not sorted");
            return;
        }
        checkArrSortOrNot(arr,i+1);
    }
   public static void main(String[] args) {
         int arr[]={1,2,8,3,4,5};
         checkArrSortOrNot(arr,0);
   } 
}
