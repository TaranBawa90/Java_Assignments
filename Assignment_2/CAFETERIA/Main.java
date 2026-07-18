package CAFETERIA;

public class Main {
    public static void main(String[] args) {
        FoodItem Item1=new FoodItem();
        FoodItem Item2=new FoodItem();
        FoodItem Item3=new FoodItem();

        Item1.addFoodItem(101, "Veg Sandwich", 80);
        Item2.addFoodItem(102, "Cold Coffee", 120);
        Item3.addFoodItem(103, "Paneer Wrap", 150);
        
        FoodItem.displayCafeteriaDetails();

        Item1.displayItemDetails();
        Item2.displayItemDetails();
        Item3.displayItemDetails();

        FoodItem.changeServiceCharge(15);

        System.out.println("After updating service charge");

        Item1.displayItemDetails();
        Item2.displayItemDetails();
        Item3.displayItemDetails();

        FoodItem.displayNoOfItems();
    }
}
