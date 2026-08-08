package Array_problems;
import java.util.Scanner;

public class PrintArrayElementsinReverse {
    static int helper(int[] arr,int index){
        if(index==0){
            return arr[index];
        }
        System.out.println(arr[index]);
        return helper(arr,index-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int result=helper(arr,arr.length-1);
        System.out.println(result);
    }
}
