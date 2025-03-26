//first occurrence of a number
public class firstOccurrenceINArrByR {
    public static int firstOccurrence(int[] arr,int i,  int target){
        if(i==arr.length)return -1;//no not present in array
        if(arr[i]==target)return i;
        return  firstOccurrence(arr, i+1, target);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,5,4,5,6,7,8,9,10};
        int target=5;
        System.out.println(firstOccurrence(arr,0,target));
    }
}
