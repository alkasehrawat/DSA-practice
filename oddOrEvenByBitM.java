//to check no is odd or even 
public class oddOrEvenByBitM {
    public static void main(String[] args) {
        int no=2;
        int bitmask=1;
        if((no & bitmask)==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    } 
}
