public class linearS {
    public static void ls(int key,int[] arr){
        for(int i=0;i<arr.length;i++){        
            if(arr[i]==key){
                System.out.println("key is found at "+i);
            }else{
                System.out.println("key is not found");
            }  
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10,12,14};
        ls(10,arr) ;
    }
}
