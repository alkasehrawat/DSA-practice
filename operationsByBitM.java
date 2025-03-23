//operations
public class operationsByBitM {
    //get the ith bit of a number
    public static void getIthBit(int no,int i){
        int num=no>>i;
        if((num&1)==0){
            System.out.println(" bit is 0");
        }
        else{
            System.out.println(" bit is 1");
        }
    }

    //set the ith bit of a number
    public static void setIthBit(int no ,int i){
        int bitmask=1<<i;
        int num=no | bitmask;
        System.out.println("After setting the bit "+i+" the number is "+num);
    }

    //clear the ith bit of a number
    public static void clearIthBit(int no,int i){
        int bitmask =~(1<<i);
        int num=no & bitmask;
        System.out.println("After clearing the bit "+i+" the number is "+num);
    }

    //update the ith bit of a number
    public static void updateIthBit(int no,int i){
        if((no & (1<<i))==0){
            setIthBit(no,i);
        }
        else{
            clearIthBit(no,i);
        }
    }

    //clear the last ith bits of a number
    public static void clearLastIthBits(int no,int i){
        int bitmask= ~0<<i;
        int num=no & bitmask;
        System.out.println("After clearing the last "+i+" bits the number is "+num);
    }

    //clear the range of bits from i to j
    public static void clearRangeOfBits(int no ,int i,int j){
        int ones=(~0);
        int a=ones<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        int num=no & bitmask;
        System.out.println("After clearing the range of bits from "+i+" to "+j+" the number is "+num);
    }
    public static void main(String[] args) {
        int no=3;
        int i=1;

        getIthBit(no,i);
        setIthBit(no,i);
        clearIthBit(no,i);
        updateIthBit(no,i);
        clearLastIthBits(no,i);
        clearRangeOfBits(no,1,2);
    }
}
