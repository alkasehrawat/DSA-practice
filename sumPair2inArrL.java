//pair sum by 2 pointer
import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int tar=5;
        System.out.println(pairSum(list,tar));
    }
     //find pair sum
        public static boolean pairSum(ArrayList<Integer> list,int tar){
            int lp=0;
            int rp=list.size()-1;
            while(lp!=rp){
                if(list.get(lp)+list.get(rp)==tar){
                    return true;
                }else if(list.get(lp)+list.get(rp)<tar){
                    lp++;
                }else{
                    rp--;
                }
            }  
            return false;
        }
}
