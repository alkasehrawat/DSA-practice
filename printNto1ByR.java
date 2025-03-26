public class printNto1ByR {
    //recursive function to print n to 1
    public static void printNto1(int n){
        //base case
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        n--;
        printNto1(n);
    }
    public static void main(String[] args) {
        int n=5;
        printNto1(n);
    }
}
