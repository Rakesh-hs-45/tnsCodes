package mall;

public class Product {

    private int productId;
    private String name;
    private double price;
    private int stock;

    public Product(int productId, String name, double price, int stock) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public int getProductId(){ return productId; }
    public String getName(){ return name; }
    public double getPrice(){ return price; }
    public int getStock(){ return stock; }

    public void setName(String name){ this.name = name; }
    public void setPrice(double price){ this.price = price; }
    public void setStock(int stock){ this.stock = stock; }

    public boolean reduceStock(int qty){
        if(qty <= 0){
            System.out.println("Invalid Quantity!");
            return false;
        }
        if(stock >= qty){
            stock -= qty;
            return true;
        }
        return false;
    }

    public void displayProduct(){
        System.out.println(productId+"  "+name+"  ₹"+price+"  Stock:"+stock);
    }
}