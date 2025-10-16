package Decorator;

public class DriverTwo {
 
    public static void main(String args[]){
        Order Bob = new Order();
        Burger burger = new Burger();
        FoodWithCheese cheeseburger = new FoodWithCheese(new Burger());
        Bob.addToOrder(cheeseburger);
        Bob.addToOrder(burger);

        String order = "Your order is " + Bob.listOrder() + ".";
        double totalCost = Bob.calculateCost();

        System.out.println(order);
        System.out.println("Total Meal Cost is $" + totalCost);
    }

}
