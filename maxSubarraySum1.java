public class maxSubarrSum1 {
    public static int maxSum(int[] arr){
        int maxS=0;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                     temp=temp+arr[k];
                }
                if(temp>maxS){
                    maxS=temp;
                }
                temp=0;
            }
        }
        return maxS; 
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        System.out.println(" max subarray sum is: "+maxSum(arr));
    }
}
