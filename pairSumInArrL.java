//pair sum
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
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size()-1;j++){
                if(list.get(i)+list.get(j)==tar){
                    return true;
                }
            }
        }
        return false;
        }
}
