public class trappingRainWinArray {
    public static int rainW(int[] height){
        int n=height.length;
        //find the left and right max array
        int leftA[]=new int[n];
        leftA[0]=height[0];
        for(int i=1;i<leftA.length;i++){
            leftA[i]=Math.max(leftA[i-1],height[i]);
        }

        int rightA[]=new int[n];
        rightA[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightA[i]=Math.max(rightA[i+1],height[i]);
        }

        //find the trapped rain water
        int trapW=0;
        for(int i=0;i<n;i++){
           int heig=Math.min(leftA[i],rightA[i])-height[i]; 
           int width=1;
           trapW+=heig*width;
        }
        return trapW;
    }
    public static void main(String[] args) {
        int[] height={4,2,0,6,3,2,5};
        System.out.println("total trap rain water is" +rainW(height));
    }
}
