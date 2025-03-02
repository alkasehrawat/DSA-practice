public class convert1letterInUppercase {
    //convert 1st letter of each word in uppercase
    public static void convertUpperC(String str){
        String result="";// to store the result
        String[] words=str.split(" ");//splitting the string into words
        for(String word:words){
            result+=Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        String str="hi i am alka";
        convertUpperC(str);
    }
}
