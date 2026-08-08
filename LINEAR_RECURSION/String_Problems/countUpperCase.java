package String_Problems;
import java.util.Scanner;

public class countUpperCase {
    
    static int helper(String s,int index,String s1){
       if(index<0){
        return 0;
       }
       if(s.charAt(index)==s1.charAt(index)){
        return 1+helper(s,index-1,s1);
       }
       return helper(s,index-1,s1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        int count=helper(s,s.length()-1,s.toUpperCase());
        System.out.println(count);
    }
}
