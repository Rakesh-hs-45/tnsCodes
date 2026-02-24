package mall;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    private int shopId;
    private String shopName;
    private ArrayList<Product> products;

    public Shop(int shopId,String shopName){
        this.shopId=shopId;
        this.shopName=shopName;
        products=new ArrayList<>();
    }

    public int getShopId(){ return shopId; }
    public String getShopName(){ return shopName; }
    public void setShopName(String name){ this.shopName=name; }

    public void addProduct(Product p){
        products.add(p);
    }

    public void addProductByShopkeeper(Scanner sc){

        System.out.print("Enter Product ID: ");
        int id=sc.nextInt();
        sc.nextLine();

        if(getProductById(id)!=null){
            System.out.println("Product ID already exists!");
            return;
        }

        System.out.print("Enter Product Name: ");
        String name=sc.nextLine();

        System.out.print("Enter Price: ");
        double price=sc.nextDouble();

        System.out.print("Enter Stock: ");
        int stock=sc.nextInt();

        products.add(new Product(id,name,price,stock));
        System.out.println("Product Added Successfully!");
    }

    public void displayProducts(){

        if(products.size()==0){
            System.out.println("No products available.");
            return;
        }

        System.out.println("\n--- "+shopName+" Products ---");
        for(Product p:products){
            p.displayProduct();
        }
    }

    public void editProduct(Scanner sc){

        displayProducts();
        System.out.print("Enter Product ID to Edit: ");
        int id=sc.nextInt();
        sc.nextLine();

        Product p=getProductById(id);

        if(p==null){
            System.out.println("Product not found!");
            return;
        }

        System.out.print("Enter New Name: ");
        p.setName(sc.nextLine());

        System.out.print("Enter New Price: ");
        p.setPrice(sc.nextDouble());

        System.out.print("Enter New Stock: ");
        p.setStock(sc.nextInt());

        System.out.println("Product updated successfully!");
    }

    public void deleteProduct(Scanner sc){

        displayProducts();
        System.out.print("Enter Product ID to Delete: ");
        int id=sc.nextInt();

        Product p=getProductById(id);

        if(p==null){
            System.out.println("Product not found!");
            return;
        }

        products.remove(p);
        System.out.println("Product deleted successfully!");
    }

    public Product getProductById(int id){
        for(Product p:products){
            if(p.getProductId()==id)
                return p;
        }
        return null;
    }
}