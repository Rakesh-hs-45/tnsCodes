package mall;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        MallAdmin admin=new MallAdmin();
        LoginManager login=new LoginManager();

        // default shop and products
        Shop electronics=new Shop(1,"Electronics");
        electronics.addProduct(new Product(101,"Headphones",1500,10));
        electronics.addProduct(new Product(102,"Keyboard",800,15));
        electronics.addProduct(new Product(103,"Mouse",500,20));
        admin.addShop(electronics);

        int mainChoice;

        do{
            System.out.println("\n========= SHOPPING MALL SYSTEM =========");
            System.out.println("1. Admin Login");
            System.out.println("2. Shop Login");
            System.out.println("3. Customer Login");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            mainChoice=sc.nextInt();
            sc.nextLine();

            switch(mainChoice){

            // ADMIN
            case 1:
                System.out.print("Username: ");
                String auser=sc.nextLine();
                System.out.print("Password: ");
                String apass=sc.nextLine();

                if(login.adminLogin(auser,apass)){
                    int adminChoice;
                    do{
                        System.out.println("\n1.Add 2.View 3.Edit 4.Delete 5.Logout");
                        adminChoice=sc.nextInt();

                        switch(adminChoice){
                            case 1:
                                System.out.print("Enter Shop ID: ");
                                int id=sc.nextInt(); sc.nextLine();
                                System.out.print("Enter Shop Name: ");
                                admin.addShop(new Shop(id,sc.nextLine()));
                                break;
                            case 2: admin.displayShops(); break;
                            case 3: admin.displayShops(); admin.editShop(sc.nextInt()-1,sc); break;
                            case 4: admin.displayShops(); admin.deleteShop(sc.nextInt()-1); break;
                        }
                    }while(adminChoice!=5);
                }
                break;

            // SHOP USER
            case 2:
                System.out.print("Shop Username: ");
                String su=sc.nextLine();
                System.out.print("Password: ");
                String sp=sc.nextLine();

                if(login.shopLogin(su,sp)){
                    admin.displayShops();
                    Shop s=admin.getShop(sc.nextInt()-1);

                    int ch;
                    do{
                        System.out.println("\n1.Add 2.View 3.Edit 4.Delete 5.Logout");
                        ch=sc.nextInt();
                        switch(ch){
                            case 1:s.addProductByShopkeeper(sc);break;
                            case 2:s.displayProducts();break;
                            case 3:s.editProduct(sc);break;
                            case 4:s.deleteProduct(sc);break;
                        }
                    }while(ch!=5);
                }
                break;

            // CUSTOMER
            case 3:

                System.out.println("\n1. New Purchase");
                System.out.println("2. View Order History");
                int custChoice=sc.nextInt();

                if(custChoice==2){
                    OrderHistory.showAllOrders();
                    break;
                }

                System.out.print("Enter Customer ID: ");
                int cid=sc.nextInt(); sc.nextLine();

                System.out.print("Enter Name: ");
                String name=sc.nextLine();

                System.out.print("Enter Phone: ");
                String phone=sc.nextLine();

                Customer c=new Customer(cid,name,phone);
                Order order=new Order(c);

                admin.displayShops();
                Shop shop=admin.getShop(sc.nextInt()-1);

                int choice=0;
                do{
                    shop.displayProducts();

                    System.out.print("Enter Product ID: ");
                    int pid=sc.nextInt();

                    Product p=shop.getProductById(pid);
                    if(p==null){
                        System.out.println("Invalid Product!");
                        continue;
                    }

                    System.out.print("Enter Quantity: ");
                    order.addToCart(p,sc.nextInt());

                    System.out.print("1-Continue 0-Checkout: ");
                    choice=sc.nextInt();

                }while(choice==1);

                order.printBill();
                break;
            }

        }while(mainChoice!=4);

        sc.close();
    }
}