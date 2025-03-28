public class removeDupliInStringByR {
    public static void removeDupli(String str,int i,StringBuilder ans,boolean[] track){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        //take the current character
        char ch=str.charAt(i);
        if(track[ch-'a']==true){//character already taken
            removeDupli(str,i+1,ans,track);
        }else{//character not taken
            track[ch-'a']=true;
            removeDupli(str,i+1,ans.append(ch),track);
        }
    }
    public static void main(String[] args) {
        String str="apnnacollege";
        removeDupli(str,0,new StringBuilder(),new boolean[26]);
    }
}
