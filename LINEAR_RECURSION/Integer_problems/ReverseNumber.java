package Integer_problems;
import java.util.Scanner;

public class ReverseNumber {
    static int helper(int n){
        int rev=1;
        if(n==0 && n/10==0){
            return n;
        }
        int remainder=n%10;
        rev=rev*10+remainder;
        return rev +helper(n/10);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int result = helper(n);
        System.out.println(result);
    }
}
