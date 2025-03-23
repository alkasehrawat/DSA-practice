// To count the no of set bits in a number using bit manipulation
public class countSetBitsByBitM {
    //to count the no of set bits
    public static void countBits(int num){
        int count=0;
        while(num>0){
            if((num&1)==1){
                count++;
            }
            num=num>>1;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int no=3;
        countBits(no);
    }
}
