package Array_problems;
import java.util.Scanner;

public class CheckSorted {
    static boolean helper(int[] arr,int index){
        if(index<=0){
            return true;
        }
        if(arr[index]<arr[index-1]){
            return false;
        }
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
    boolean result=helper(arr,arr.length-1);
    if(result){
        System.out.println("Sorted");
    }else{
        System.out.println("Not Sorted");
    }
}
}
