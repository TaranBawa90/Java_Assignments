package EmployeeProjectAllocationSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int employees=sc.nextInt();
        int projects=sc.nextInt();
        int[][] arr=new int[employees][projects];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        sc.close();
        ProjectAllocation obj=new ProjectAllocation(employees, projects, arr);

        obj.displayEmployeeReport();
        obj.calculateEmployeeTotal();
        obj.generateProjectReport();
        obj.calculateProjectTotal();
        obj.findMostWorkedProject();
    }
}
