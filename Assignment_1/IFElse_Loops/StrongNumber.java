package IFElse_Loops;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int last=sc.nextInt();
        sc.close();
        for(int i=start;i<=last;i++){
            int sum=0;
            for(int j=i;j>0;){
                int b=j%10;
                int fact=1;
                for(int k=2;k<=b;k++){
                    fact=fact*k;
                }
                sum=sum+fact;
                j=j/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
