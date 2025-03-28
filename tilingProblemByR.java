public class tilingProblemByR {
    public static int tiling(int n){
        //base case
        if(n==0||n==1){
            return n;
        }
        //vertical tiling
        int vert=tiling(n-1);
        //horizontal tiling
        int horz=tiling(n-2);
        return vert+horz;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tiling(n));
    }
}
