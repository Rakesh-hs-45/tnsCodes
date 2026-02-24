package mall;

import java.util.ArrayList;

public class OrderHistory {

    private static ArrayList<Order> orders = new ArrayList<>();

    public static void addOrder(Order order){
        orders.add(order);
    }

    public static void showAllOrders(){

        if(orders.size()==0){
            System.out.println("No previous orders found.");
            return;
        }

        System.out.println("\n========= ORDER HISTORY =========");

        for(Order o : orders){
            o.printBill();
        }
    }
}