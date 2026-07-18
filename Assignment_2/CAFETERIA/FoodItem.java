package CAFETERIA;

public class FoodItem {
    int itemId;
    String itemName;
    double price;
    double FinalPrice;

    static String cafeteriaName="Ucampus Cafeteria";
    static double serviceCharge=10.0;
    static int totalFoodItems=0;

    void addFoodItem(int id,String name,double price){
        itemId=id;
        itemName=name;
        this.price=price;

        FoodItem.totalFoodItems++;
    }

    void calculateFinalPrice(){
        this.FinalPrice = price + ( price * FoodItem.serviceCharge / 100);
    }

    void displayItemDetails(){
        calculateFinalPrice();
        System.out.println("Item Id: "+itemId+" Name: "+itemName+" Original price: "+price+" Final price: "+FinalPrice);
    }

    static void changeServiceCharge(double newCharge){
        FoodItem.serviceCharge=newCharge;
    }

    static void displayCafeteriaDetails(){
        System.out.println("Cafeteria Name: "+FoodItem.cafeteriaName
            +" Current Service Charge: "+FoodItem.serviceCharge+" Total Food Items: "+FoodItem.totalFoodItems
        );
    }
    static void displayNoOfItems(){
        System.out.println(FoodItem.totalFoodItems);
    }
}
