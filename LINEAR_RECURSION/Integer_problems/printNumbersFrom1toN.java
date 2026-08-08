package Integer_problems;
import java.util.Scanner;

public class printNumbersFrom1toN {

    static int helper(int n,int start){
        if(n==start){
            return n;
        }else{
            System.out.println(start);
        }
        return helper(n,start+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers u want to print: ");
        int n=sc.nextInt();
        sc.close();
        int result=helper(n,1);
        System.out.println(result);
    }
}
