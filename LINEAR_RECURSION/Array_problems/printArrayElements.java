package Array_problems;
import java.util.Scanner;

public class printArrayElements {

    static int helper(int[] arr,int startindex,int endindex){
        if(startindex==endindex){
            return arr[endindex];
        }
        System.out.println(arr[startindex]);
        return helper(arr, ++startindex, endindex);
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int result= helper(arr,0,arr.length-1);
        System.out.println(result);
     }
}
