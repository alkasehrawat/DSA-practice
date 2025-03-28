public class withoutConsecutiveOnesByR {
    public static void printBinStrings(int n,int lastP, String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinStrings(n-1,0,str+"0");//if last position is 0
        if(lastP==0){
            printBinStrings(n-1,1,str+"1");//if last position is 1
        }
    }
    public static void main(String[] args) {
        printBinStrings(3,0,"");
    }
}
