package String_Problems;
import java.util.Scanner;

public class CharOccurences {

    static int helper(String s,int index,char target){
         if(index<0){
            return 0;
         }
         if(s.charAt(index)==target){
            return 1+helper(s,index-1,target);
         }
         return helper(s,index-1,target);
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char a=sc.next().charAt(0);
        sc.close();
        int result=helper(s,s.length()-1,a);
        System.out.println(result);
    }
    
}
