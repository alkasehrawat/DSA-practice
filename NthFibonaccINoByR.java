//find the nth fibonacci number using recursion
public class NthFibonaccINoByR {
    public static int fib(int n){
        if(n==0||n==1)return n;
        int ans=fib(n-1)+fib(n-2);
        return ans;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(fib(n));
    }
}
