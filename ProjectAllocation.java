package EmployeeProjectAllocationSystem;
public class ProjectAllocation{
    int employees;
    int projects;
    int[][] working_hours;
    int max=0;
    int most_worked;
    int[][] transpose;
    ProjectAllocation(int employees,int projects,int[][] arr){
       this.employees=employees;
       this.projects=projects;
       working_hours=new int[employees][projects];
       for(int i=0;i<working_hours.length;i++){
        for(int j=0;j<working_hours[i].length;j++){
            working_hours[i][j]=arr[i][j];
        }
       }
    }

    void displayEmployeeReport(){
        for(int i=0;i<working_hours.length;i++){
            System.out.print("Employee "+(i+1)+" = ");
            for(int j=0;j<working_hours[i].length;j++){
                System.out.print(working_hours[i][j]+" ");
            }
            System.out.println();
        }
    }

    void calculateEmployeeTotal(){
        for(int i=0;i<working_hours.length;i++){
            int sum=0;
            for(int j=0;j<working_hours[i].length;j++){
               sum+=working_hours[i][j];
            }
            System.out.println("Employee "+(i+1)+" Total: "+sum);
        }
    }

    void generateProjectReport(){
        transpose=new int[projects][employees];
        for(int i=0;i<working_hours.length;i++){
            for(int j=0;j<working_hours[i].length;j++){
                transpose[j][i]=working_hours[i][j];
            }
        }
        for(int i=0;i<transpose.length;i++){
            System.out.print("Project P"+(i+1)+": ");
            for(int j=0;j<transpose[i].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }

    void calculateProjectTotal(){
        for(int i=0;i<transpose.length;i++){
            int sum=0;
            for(int j=0;j<transpose[i].length;j++){
                sum+=transpose[i][j];
                
            }
            if(max<sum){
                    max=sum;
                    this.most_worked=(i+1);
                }
            System.out.println("Project P"+(i+1)+" : "+sum);
        }
    }

    void findMostWorkedProject(){
        System.out.print("Most Worked Project: P"+most_worked);
    }
}