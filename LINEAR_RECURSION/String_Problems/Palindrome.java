package String_Problems;
import java.util.Scanner;

public class Palindrome {
    static String helper(String old,int index){
        String newStr="";
        if(index<0){
            return "";
        }
        newStr=newStr+old.charAt(index);
        return newStr+helper(old,index-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        String result=helper(s,s.length()-1);
        if(s.equals(result)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
