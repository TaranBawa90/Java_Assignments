package String_Problems;
import java.util.Scanner;

public class printEachStringOnNewLine {
    
    static String helper(String s,int start,int end){
        if(start>end){
            return "";
        }
        if(s.charAt(start)==' '){
            return "\n"+helper(s,start+1,end);
        }
        return s.charAt(start)+helper(s,start+1,end);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();
        String c=helper(s,0,s.length()-1);
        System.out.println(c);
    }
}
