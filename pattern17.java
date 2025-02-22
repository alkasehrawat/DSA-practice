//pattern,
public class pattern17 {
    public static void main(String[] args) {
        int n=5;
        //upper half
        for (int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }

            for(int j=1;j<=i*2-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 2 * (n - i + 1) - 1; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
