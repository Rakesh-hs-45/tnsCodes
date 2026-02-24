package mall;

import java.util.ArrayList;

public class Order {

    private static int orderCounter=1;
    private int orderId;
    private Customer customer;
    private ArrayList<CartItem> cart;

    public Order(Customer customer){
        this.customer=customer;
        this.orderId=orderCounter++;
        cart=new ArrayList<>();
    }

    public int getOrderId(){
        return orderId;
    }

    public void addToCart(Product product,int qty){

        if(product.reduceStock(qty)){
            cart.add(new CartItem(product,qty));
            System.out.println("Added to cart.");
        }else{
            System.out.println("Insufficient stock!");
        }
    }

    public void printBill(){

        double total=0;

        System.out.println("\n========= SHOPPING BILL =========");
        System.out.println("Order ID: "+orderId);
        System.out.println("Customer: "+customer.getName()+" Phone: "+customer.getPhone());
        System.out.println("---------------------------------");
        System.out.printf("%-15s %-5s %s\n","Product","Qty","Price");

        for(CartItem item:cart){
            item.displayItem();
            total+=item.getTotalPrice();
        }

        System.out.println("---------------------------------");
        System.out.printf("TOTAL AMOUNT: ₹%.2f\n",total);
        System.out.println("=================================");

        // Save to history
        OrderHistory.addOrder(this);
    }
}