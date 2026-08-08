package Integer_problems;
import java.util.Scanner;

public class countDigits {
    
    static int helper(int n){
        if(n%10==0 && n/10==0){
            return 0;
        }
        return 1+ +helper(n/10);
    }

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         sc.close();
         int result=helper(n);
         System.out.println(result);
    }
}
