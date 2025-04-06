//pair sum in rotated arraylist
import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int tar=16;
        System.out.println(rotatedPairSum(list,tar));
    }
     //find pair sum
        public static boolean rotatedPairSum(ArrayList<Integer> list,int tar){
            int bp=-1;//breaking point in array
            int n=list.size();
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)>list.get(i+1)){
                    bp=i;//find breaking point or ending of sorted arr
                    break;
                }
            }
            int lp=(bp+1)%n;
            int rp=bp;
            while(lp!=rp){
                if(list.get(lp)+list.get(rp)==tar){
                    return true;
                }else if(list.get(lp)+list.get(rp)<tar){
                    lp=(lp+1)%n;
                }else{
                    rp=(n+rp-1)%n;
                }
            }  
            return false;
        }
}
