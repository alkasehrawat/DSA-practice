// Code to check whether a number is power of 2 or not using Bit Manipulation
public class checkNoIsPowerOf2orNotByBitM {
    public static void checkNo(int num){
        if((num & (num-1))==0){
            System.out.println("The number is power of 2");
        }
        else{
            System.out.println("The number is not power of 2");
        }
    }
    public static void main(String[] args) {
        int num=4;
        checkNo(num);
    }
}
