// Description: Write a program to find the sum of first n natural numbers using recursion.
public class sumOF1NatuNoByR {
    public static int sum(int n){
        if(n==0)return 0;
        int ans=n+sum(n-1);
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
}
