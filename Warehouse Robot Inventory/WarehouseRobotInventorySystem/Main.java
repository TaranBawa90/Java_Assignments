package WarehouseRobotInventorySystem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        Warehouse obj=new Warehouse(n, arr);
        obj.displayInventory();
        obj.getRobotVisitOrder();
        obj.calculateBoundaryStock();
        obj.findMaximumSection();
    }
}
