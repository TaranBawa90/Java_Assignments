package IFElse_Loops;

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start = sc.nextInt();
        int end=sc.nextInt();
    
        for(int i=start;i<=end;i++){
            if(i<2){
               continue;
            }
            int prime=1;
            for(int j=2;j<i;j++){
               if(i%j==0){
                 prime=0;
                 break;
               }
               else{
                 prime=1;
               }
            }
            if(prime==1){
                 System.out.println(i);
            }
        }
        sc.close();
    }
}
