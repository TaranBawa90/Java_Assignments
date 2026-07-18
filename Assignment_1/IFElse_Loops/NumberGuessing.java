package IFElse_Loops;

import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int secretnum=27;
         for(int i=0;i<5;i++){
             int usernum=sc.nextInt();
        
             if(usernum<secretnum){
                 System.out.println("Too Low");
             }
             else if(usernum>secretnum){
                 System.out.println("Too High");
             }else{
                 System.out.println("Congratulations! You guessed it.");
                 break;
             }
             if(usernum!=secretnum && i==4){
                 System.out.println("Better Luck Next Time!");
             }
          }
          sc.close();
    }
}
