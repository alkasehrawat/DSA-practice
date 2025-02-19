//prefix sum approach to find the maximum subarray sum
public class maxSubarrSum2 {
    public static int subarrSum(int[] arr,int prefixSum[]){
        prefixSum[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefixSum[i]=arr[i]+prefixSum[i-1];
        }
        int max=0;
        for(int i=0;i<prefixSum.length;i++){
           for(int j=0;j<prefixSum.length;j++){
            int currentSum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];
            if (currentSum > max) {
                max = currentSum;
            }
           }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        int[] prefixSum=new int[arr.length];
        System.out.println(subarrSum(arr,prefixSum));
    }
}
