package String_Problems;
import java.util.Scanner;

public class printchars {
    static String print(String s,int startindex,int endindex){
        if(startindex==endindex){
            return s.charAt(startindex)+"";
        }
        return s.charAt(startindex)+"\n"+print(s,startindex+1,endindex);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        String result=print(s,0,s.length()-1);
        System.out.println(result);
    }
}
