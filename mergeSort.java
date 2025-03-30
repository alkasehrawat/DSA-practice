public class mergeSort {
    //print sorted array
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    //merge sort
    public static void mergeS(int[] arr,int si,int ei){
        //base case
        if(si>=ei){
            return;
        }
        //find mid for curr si and ei
        int mid=si+(ei-si)/2;
        mergeS(arr, si, mid);//left part
        mergeS(arr,mid+1,ei);//right part
        //for conquer(compare and sort)
        compare(arr,si,mid,ei);
    }
    //compare and sort array
    public static void compare(int[] arr,int si,int mid,int ei){
        int[] temp=new int[ei-si+1];//make temp array to store curr elems
        int i=si;//left part
        int j=mid+1;//right part
        int k=0;//temp array storage
        while(i<=mid&&j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //leftout elements of left part after comparison
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //leftout elements of right part after comparison
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //store elems from temp to orig array
        for( k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[]={3,7,2,9,5,1,8};
       mergeS(arr,0,arr.length-1);
       printArr(arr);
    }
}
