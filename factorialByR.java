// Description: A recursive function to calculate the factorial of a number.
public class factorialByR {
    public static int factorial(int n){
        if(n==0)return 1;
        int ans=n*factorial(n-1);
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
    }
}
