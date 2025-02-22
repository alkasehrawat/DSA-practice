//  Search in a sorted matrix 
public class searchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int tar=29;
        int i=0;
        int j=arr[0].length-1;

        while( i < arr.length && j >= 0){
            int strt=arr[i][j];
           if(strt==tar){
            System.out.println("The target element is found " + strt);
            return;
           }
           if(strt>tar){
            j--;
           }else{
            i++;
           }
        }
        System.out.println("The target element is not found");
    }
}
