//swap
import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(1);
        list.add(9);
       int idx1=1;
       int idx2=3;
       swap(list,idx1,idx2);
       print(list);
    }
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }
    public static void print(ArrayList<Integer> list){
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
    }
}
