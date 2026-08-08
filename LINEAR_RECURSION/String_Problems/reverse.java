package String_Problems;
import java.util.Scanner;

public class reverse {

    static String helper(String s,int index){
        if(index<0){
            return "";
        }
        return s.charAt(index)+helper(s,index-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        String result=helper(s,s.length()-1);
        System.out.println(result);
    }
}
