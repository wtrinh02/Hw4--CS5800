package Decorator;

import java.util.ArrayList;

public class Order {
    
   private ArrayList<Food> order;

    public Order(){
        order =  new ArrayList<>();
    }

    public void addToOrder(Food fooditem){
        order.add(fooditem);
    }

    public String listOrder(){

        String totalOrder = "";

        for (Food item : order){
            totalOrder += item.name() + " ";
        }

        return totalOrder;
    }

    public double calculateCost(){
        double total = 0;
        for (Food item : order){
            total += item.cost();
        }
        return total;
    }
}
