//compress the string 
public class stringCompression {
    public static void StrCompress(String str){
        String result="";
        int count=1;
        for(int i=0;i<str.length();i++){
            if(i+1<str.length() && str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else{
                result+=str.charAt(i)+""+count;
                count=1;
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        String str="aaabbcc";
        StrCompress(str);
    }
}
