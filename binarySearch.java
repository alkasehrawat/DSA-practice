public class binarySearch {
    public static int binS(int key,int[] arr){
        int strt=0;
        int end=arr.length-1;
        while(strt<=end){
            int mid=(strt+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                strt=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;//if not exist
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        System.out.println("key is found at "+binS(9,arr));
    }
}
