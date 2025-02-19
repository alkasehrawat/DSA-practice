public class reverseArr{
    public static void rev(int[] arr){
        int strt=0;
        int end=arr.length-1;
        while(strt<end){
        int temp=arr[strt];
        arr[strt]=arr[end];
        arr[end]=temp;
        strt++;
        end--;
       }
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,12};
        rev(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
