package IFElse_Loops;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
               System.out.printf("%d -> Odd\n",i);
            }else{
               System.out.printf("%d -> Even\n",i);
            }
        }
    }
}
