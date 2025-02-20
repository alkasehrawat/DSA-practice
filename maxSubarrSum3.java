//max subarray sum by kadane's algorithm
public class maxSubarrSum3 {
    public static void subarrS(int[] arr){
        int currS=0;
        int maxS=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currS+=arr[i];
            if(currS<0){
                currS=0;
            }
            maxS= Math.max(currS, maxS);
        }
        System.out.println("The maximum subarray sum is: "+maxS);
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,-8,10};
        subarrS(arr);
    }
}
