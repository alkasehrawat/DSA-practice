public class smallestNO {
    public static int smallest(int[] arr){
        int smallest =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14};
        System.out.println("The smallest number is: "+smallest(arr));
    }   
}
