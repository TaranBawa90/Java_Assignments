package Integer_problems;
import java.util.Scanner;

public class printNumbersFromNto1 {

    static int helper(int n){
        if(n==1){
            return 1;
        }
        System.out.println(n);
        return helper(n-1);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int result=helper(n);
        System.out.println(result);
    }
}
