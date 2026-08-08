package Array_problems;
import java.util.Scanner;

public class Maximum {
    static int helper(int[] arr,int index,int maximum){
        if(index<0){
            return maximum;
        }
        if(arr[index]>maximum){
            maximum=arr[index];
        }
        return helper(arr,index-1,maximum);
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int max=helper(arr,arr.length-1,arr[0]);
        System.out.println(max);
    }
}
