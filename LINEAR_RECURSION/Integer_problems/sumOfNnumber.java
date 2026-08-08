package Integer_problems;
import java.util.Scanner;

public class sumOfNnumber {
    static int helper(int n){
        if(n==0){
            return 0;
        }
        return n+helper(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=helper(n);
        System.out.println(result);
        sc.close();
    }
}
