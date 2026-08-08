package Array_problems;
import java.util.Scanner;

public class Minimum {
    static int helper(int[] arr,int index,int minimum){
        if(index<0){
            return minimum;
        }
        if(arr[index]<minimum){
            minimum=arr[index];
        }
        return helper(arr,index-1,minimum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int result=helper(arr,arr.length-1,arr[0]);
        System.out.println(result);
    }
}
