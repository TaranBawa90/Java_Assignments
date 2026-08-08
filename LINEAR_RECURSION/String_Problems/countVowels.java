package String_Problems;
import java.util.Scanner;

public class countVowels {
    
    static int vowels(String s,int index){
        if(index<0){
            return 0;
        }
        if(s.charAt(index)=='a' || s.charAt(index)=='e' || s.charAt(index)=='i' || s.charAt(index)=='o' || s.charAt(index)=='u'){
        return 1+vowels(s,index-1);
        }
        return vowels(s,index-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.close();
        int result=vowels(s.toLowerCase(),s.length()-1);
        System.out.println(result);
    }
}
