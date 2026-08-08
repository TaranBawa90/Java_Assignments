package Array_problems;
import java.util.Scanner;

public class CountOccurences {
    static int Occurence(int[] arr,int index,int target){
        int count=0;
        if(index<0){
            return count;
        }
        if(arr[index]==target){
            count++;
        }
       return count + Occurence(arr,index-1,target);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        sc.close();
        int result=Occurence(arr,arr.length-1,target);
        System.out.println(result);
    }
}
