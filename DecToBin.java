//create a function that takes a decimal number and converts it to binary
public class decToBin {
    public static void dToB(int n){
        int decNo=n;
        int binNo=0;
        int pow=0;
        while(decNo>0){
            int rem=decNo%2;
            binNo=binNo+rem*(int)Math.pow(10,pow);
            decNo=decNo/2;
            pow++;
        }
        System.out.println("The binary number is: "+binNo);     
    }
    public static void main(String[] args) {
        dToB(7);
    }
 }
