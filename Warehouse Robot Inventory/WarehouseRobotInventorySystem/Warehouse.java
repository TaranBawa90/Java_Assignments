package WarehouseRobotInventorySystem;
import java.util.HashMap;
public class Warehouse {
    int n;
    int[][] inventory;
    int maxelement;
    int maxsection;
    HashMap<Integer,Integer> map=new HashMap<>();
    Warehouse(int n,int[][] arr){
        inventory=new int[n][n];
        this.n=n;
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            this.inventory[i][j]=arr[i][j];
        }
      }
    }

    void displayInventory(){
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(inventory[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void getRobotVisitOrder(){
        int top=0;
        int bottom=inventory.length-1;
        int left=0;
        int right=inventory[0].length-1;
        int section=1;
        maxelement=inventory[0][0];
        while(left<=right && top<=bottom){
        int total=0;
        
        System.out.println("Section : "+section);
        for(int i=left;i<=right;i++){
            System.out.print(inventory[top][i]+" ");
            total++;
            if(maxelement<inventory[top][i])maxelement=inventory[top][i];
        }
        top++;
        for(int i=top;i<=bottom;i++){
            System.out.print(inventory[i][right]+" ");
            total++;
            if(maxelement<inventory[i][right])maxelement=inventory[i][right];
        }
        right--;
        for(int i=right;i>=left && top<=bottom;i--){
            System.out.print(inventory[bottom][i]+" ");
            total++;
            if(maxelement<inventory[bottom][i])maxelement=inventory[bottom][i];
        }
        bottom--;
        for(int i=bottom;i>=top && left<=right;i--){
            System.out.print(inventory[i][left]+" ");
            total++;
            if(maxelement<inventory[i][left])maxelement=inventory[i][left];
        }
        left++;
        
        map.put(section,total);
        section++;
        System.out.println();
    }
    System.out.println();
    }

    void calculateBoundaryStock(){
        for(int section:map.keySet()){
            System.out.println("Number of Boundary elements in Section "+section+" are: "+map.get(section));
        }
        
    }
    void findMaximumSection(){
        System.out.println();
        System.out.print("maximum element in matrix : ");
        System.out.println(maxelement);
    }
}
