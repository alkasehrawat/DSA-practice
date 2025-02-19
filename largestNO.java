public class largestNO {
    public static int largest(int[] arr){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        System.out.println("The largest number is: "+largest(arr));
    }
}
