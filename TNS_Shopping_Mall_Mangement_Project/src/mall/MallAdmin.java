package mall;

import java.util.ArrayList;
import java.util.Scanner;

public class MallAdmin {

    private ArrayList<Shop> shops=new ArrayList<>();

    public void addShop(Shop s){ shops.add(s); }

    public void displayShops(){

        if(shops.size()==0){
            System.out.println("No shops available.");
            return;
        }

        System.out.println("\n------ SHOP LIST ------");
        for(int i=0;i<shops.size();i++){
            System.out.println((i+1)+". ID:"+shops.get(i).getShopId()
                    +" Name:"+shops.get(i).getShopName());
        }
    }

    public Shop getShop(int index){
        if(index>=0 && index<shops.size())
            return shops.get(index);
        return null;
    }

    public void deleteShop(int index){
        if(index>=0 && index<shops.size()){
            shops.remove(index);
            System.out.println("Shop deleted successfully!");
        }
    }

    public void editShop(int index,Scanner sc){
        if(index>=0 && index<shops.size()){
            sc.nextLine();
            System.out.print("Enter New Shop Name: ");
            shops.get(index).setShopName(sc.nextLine());
            System.out.println("Shop updated!");
        }
    }
}