public class quickSort {
     //print sorted array
     public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    //quick sort
    public static void quickS(int[] arr,int si,int ei){
       //base case
       if(si>=ei)return;
        int pIdx=find(arr,si,ei);//index of pivot 
        quickS(arr, si, pIdx-1);  //left part
        quickS(arr, pIdx+1, ei); //right part 
    }
    //comparison and swap in orig array
    public static int find(int[] arr,int si,int ei){
        int pivot=arr[ei];//pivot elem
        int i=si-1;//for comarison
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){//smaller elems come in left of pivot so...
                //swap
                i++;
                int temp=arr[j];//swap smaller ones
                arr[j]=arr[i];
                arr[i]=temp;
            }          
        }
        i++;
         //swap pivot(last elem) to its correct place after the smalls and before the largers
         int temp=pivot;
         arr[ei]=arr[i];
         arr[i]=temp;
        return i;//index of curr pivot elem
    }
    public static void main(String[] args) {
        int arr[]={3,7,6,2,9,4,5,1,8};
       quickS(arr,0,arr.length-1);
       printArr(arr);
    }  
    
}
