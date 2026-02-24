package mall;

import java.util.HashMap;

public class CustomerManager {

    private HashMap<String,String> customers=new HashMap<>();

    public void register(String u,String p){
        customers.put(u,p);
        System.out.println("Registration successful!");
    }

    public boolean login(String u,String p){
        return customers.containsKey(u)&&customers.get(u).equals(p);
    }
}