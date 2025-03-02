//shortest path from origin to destination
public class shortestPath {
    public static int shortPath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);//taking each character from string
            if(ch=='N'){
                y++;
            }
            else if(ch=='S'){
                y--;
            }
            else if(ch=='E'){
                x++;
            }
            else if(ch=='W'){
                x--;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (int)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String str="WNEENESENNN";
        System.out.println(shortPath("shortest path from origin is : "+str));
    }
}
