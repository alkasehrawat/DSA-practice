//container with most water
import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        int sp=0;
        int lp=list.size()-1;
        int maxW=0;
        while(sp<lp){
            int height=Math.min(list.get(sp),list.get(lp));
            int wid=lp-sp;
            int currwater=height*wid;
            maxW=Math.max(maxW,currwater);
            if(list.get(sp)<list.get(lp)){
                sp++;
            }else{
                lp--;
            }
        }
        System.out.print("max water:"+maxW);
    }
}
