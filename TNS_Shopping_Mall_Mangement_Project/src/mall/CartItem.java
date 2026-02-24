package mall;

public class CartItem {

    private Product product;
    private int quantity;

    public CartItem(Product product,int quantity){
        this.product=product;
        this.quantity=quantity;
    }

    public double getTotalPrice(){
        return product.getPrice()*quantity;
    }

    public void displayItem(){
        System.out.printf("%-15s %-5d ₹%.2f\n",
                product.getName(),
                quantity,
                getTotalPrice());
    }
}